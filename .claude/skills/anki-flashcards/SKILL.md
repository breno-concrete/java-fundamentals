---
name: anki-flashcards
description: Gera flashcards conceituais (pequenos e certeiros) num arquivo .txt pronto para importar no Anki, cobrindo TODOS os conceitos estudados na sessão atual, sem deixar nenhum para trás. Use quando Breno pedir "flashcards", "cards", "anki", "gera os cards da sessão", "revisão espaçada" ou "transforma isso em card", mesmo sem essas palavras exatas, desde que o pedido seja transformar o que foi estudado em cards.
---

# Flashcards Anki da sessão

Objetivo: transformar **tudo** o que foi estudado na sessão em cards conceituais curtos, num arquivo que o Anki importa direto, sem configurar nada.

## Idioma: tudo em português

Pergunta, resposta, cloze, campo extra e tags: **sempre em português**, mesmo que a fonte (livro, doc, ROADMAP) esteja em inglês. Traduza.

- Fica como está só o que é **nome de código**: classes, métodos, palavras-chave, APIs (`HashMap`, `equals`, `record`, `Optional`), sempre em `<code>`.
- Jargão técnico vai em português, com o termo em inglês entre parênteses na primeira vez no card: "fator de carga (*load factor*)", "balde (*bucket*)", "imutabilidade".
- Nome de problema do LeetCode fica no original ("Two Sum"); o resto do card, em português.
- Nome de baralho segue o que já existe no Anki do Breno (ver abaixo), mesmo quando está em inglês (`DSA::Linked Lists`).

## Baralhos: use os do Breno

[decks.md](decks.md) tem a árvore de baralhos que Breno já usa e uma tabela de qual assunto cai em qual. **Leia antes de escrever os cards.**

- Cada card vai para o baralho existente que melhor encaixa, no nível mais específico (`JAVA::Collection`, não `JAVA`).
- Uma sessão pode gerar cards para vários baralhos: o baralho é uma coluna, então tudo sai num arquivo só.
- **Só crie baralho novo** se nenhum existente servir. Crie como subbaralho do pai mais próximo, no mesmo estilo dos irmãos (ex.: `JAVA::JVM`, `JAVA::Exceções`); assunto sem pai nenhum vira baralho de topo (ex.: `Sistemas Operacionais`). O Anki cria o baralho sozinho na importação.
- Todo baralho novo: anote em `decks.md` (seção "Criados pela skill") e avise Breno na entrega.

## Passo 1: inventário (antes de escrever qualquer card)

Releia a sessão inteira, do começo ao fim, e liste **cada** conceito que apareceu. Fontes:

- explicações que dei ou que Breno deu (inclusive as que corrigi: o erro dele vira card);
- código escrito ou revisado em `src/` e os testes (o que cada teste prova);
- leituras citadas (capítulos, Items do *Effective Java*…);
- problemas de LeetCode: padrão, ideia-chave, complexidade, o truque que destrava;
- dúvidas que ele perguntou e o "por quê" de cada resposta;
- `notes/weekNN.md` e o `weeks/week-NN.md` da semana, se foram tocados na sessão.

Escreva o inventário como lista numerada para Breno ver. Cada item vira **pelo menos um** card. Conceito grande se quebra em vários itens.

Para não repetir, rode `grep -rih "<termo>" flashcards/` nos arquivos anteriores. Se um conceito já tiver card, só gere card novo se a sessão trouxe um ângulo novo.

## Passo 2: escrever os cards

Regras (princípio da informação mínima):

1. **Um fato por card.** Se a resposta tem "e", provavelmente são dois cards.
2. **Resposta curta:** até ~20 palavras, ou 1–3 linhas de código. Se precisar de mais, quebre.
3. **Pergunta conceitual, não decoreba.** Prefira:
   - *Por quê?* "Por que sobrescrever equals sem hashCode quebra o HashSet?"
   - *O que acontece se…?* "O que acontece com uma chave mutável alterada depois do put?"
   - *Contraste:* "Diferença entre == e equals em objetos?"
   - *Quando usar:* "Quando HashMap deixa de ser O(1)?"
   - *Custo:* "Complexidade de get no HashMap: média e pior caso?"
   - *Padrão LeetCode:* "Two Sum: que estrutura troca O(n²) por O(n), e guardando o quê?"
4. **Pergunta sem ambiguidade:** só pode haver uma resposta certa. Dê contexto na frente quando precisar ("Em Java, …", "No HashMap do Java 8+, …").
5. **Sem listas longas.** Lista de 5 itens (ex.: as 5 propriedades do equals) vira 1 card por item ("Propriedade do equals: se x.equals(y), então y.equals(x). Nome?") e, no máximo, um card de cloze com a lista.
6. **Código mínimo:** só o trecho que mostra o conceito, em `<code>`.
7. **Palavras do Breno:** use os termos que apareceram na sessão, seguindo a regra de idioma acima.

## Passo 3: checagem de cobertura

Antes de salvar, monte a tabela inventário → cards → baralho (`#1 → w01-equals-01, w01-equals-02 → JAVA::OO`). **Item sem card = card faltando: escreva.** Mostre a tabela a Breno.

## Passo 4: gerar o arquivo

- Caminho: `flashcards/AAAA-MM-DD-<tema-curto>.txt` (crie a pasta se não existir).
- Formato: copie o cabeçalho de [template.txt](template.txt). Separador é **TAB**. Uma linha por card.
- Colunas: `guid` ⇥ `baralho` ⇥ `frente` ⇥ `verso` ⇥ `tags`.
- **guid** estável e único: `wNN-<conceito>-NN` (ex.: `w01-hashmap-resize-01`). Reimportar o mesmo guid **atualiza** o card em vez de duplicar.
- **baralho:** nome exato de [decks.md](decks.md) (ex.: `JAVA::Collection`).
- **tags** em português, separadas por espaço, sem espaço dentro: `semana01 hashmap`.
- HTML ligado: quebra de linha é `<br>`, código é `<code>…</code>`, negrito `<b>`. Escape `<` e `>` dentro de código como `&lt;` `&gt;` (ex.: `Map&lt;K, V&gt;`).
- **Proibido** TAB ou quebra de linha real dentro de um campo: quebra a importação.
- Cards de lista (cloze) vão num segundo arquivo `…-cloze.txt` com `#notetype:Cloze`, colunas `guid` ⇥ `baralho` ⇥ `texto` ⇥ `extra` ⇥ `tags` e lacunas `{{c1::…}}`.

Depois de escrever, valide: `awk -F'\t' '!/^#/ && NF!=5 {print FILENAME": linha "NR" tem "NF" colunas"}' flashcards/<arquivo>.txt` não pode imprimir nada.

## Passo 5: entregar

Diga a Breno: quantos cards por baralho, quais baralhos novos foram criados, o caminho do arquivo e como importar:

> Anki → Arquivo → Importar → escolha o `.txt`. O cabeçalho já define separador, tipo de nota, coluna de baralho, guid e tags. Se o Anki estiver em português e não achar o tipo "Basic", escolha **Básico** (ou **Omissão de palavras** no arquivo cloze) na tela de importação.

## Exemplo

```
w01-equals-hashcode-01	JAVA::OO	Por que sobrescrever <code>equals</code> sem <code>hashCode</code> quebra o <code>HashSet</code>?	Objetos iguais geram hashes diferentes e caem em baldes (<i>buckets</i>) diferentes, então o set nem chega a chamar <code>equals</code>.	semana01 equals-hashcode
w01-hashmap-resize-01	JAVA::Collection	No <code>HashMap</code>, quando ele se redimensiona por padrão?	Quando o tamanho passa de 75% da capacidade (fator de carga, <i>load factor</i>, 0.75); a capacidade dobra.	semana01 hashmap
w01-twosum-01	DSA::ARRAYS	Two Sum: qual estrutura leva de O(n²) para O(n), e o que ela guarda?	Um <code>HashMap</code> de valor → índice; para cada x, procura <code>target - x</code>.	semana01 leetcode arrays-e-hashing
```
