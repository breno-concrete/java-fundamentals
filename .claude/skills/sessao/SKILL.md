---
name: sessao
description: "Conduz a sessão diária de estudo do Breno, de 4h (intensivo) ou de 2h (dia curto ou pós-intensivo): abre o dia, ensina, pratica, faz algoritmos, fecha e passa para a hora de projeto. Use quando ele disser 'bora', 'começar', 'sessão', 'continuar', '/sessao', '/sessao 4h', '/sessao 2h', 'só tenho 2 horas' ou 'parei'."
---

# Sessão diária

O dia é para **aprender**: explicação e exemplo antes, prática depois. Nunca abrir com prova, auditoria ou "defenda".

## 1. Abrir (até 2 min, sem perguntas)

1. Veja data e hora com `date`.
2. Leia, só o necessário: `docs/learner/PROGRESS.md`, a linha de hoje em `docs/ROADMAP.md`, o `docs/weeks/week-NN.md` da semana e o `docs/days/AAAA-MM-DD.md`.
3. Se faltar o arquivo da semana ou do dia, crie a partir do roadmap. Se o dia já começou, retome da primeira caixa aberta.
4. Escolha o modo. O argumento dele manda. Sem argumento:

| Situação | Modo |
|---|---|
| 23/nov/2026 a 27/fev/2027 | **4h** |
| No intensivo, mas ele só tem 2h, ou é semana de prova da UnB | **2h curto** |
| A partir de 28/fev/2027 | **2h normal** |
| Feriado marcado no roadmap | revisão leve, o que ele quiser |

5. Mostre o mapa do dia em até 6 linhas, com horários a partir de agora, e comece a ensinar.

## 2. Modos

### 4h (pausa de 10 min entre as horas, que podem ser separadas)

| Hora | Bloco | Minutos |
|--:|---|---|
| 1 | Aprender | 10 relembrar · 20 explicar · 20 exemplo resolvido · 10 dúvidas |
| 2 | Praticar | 60 de código dele, teste primeiro |
| 3 | Algoritmos | 15 padrão em outro exemplo · 30 sozinho · 15 solução e revisão |
| 4 | Fechar e projeto | 10 fechamento · 50 projeto |

- **Segunda:** as horas 1 e 2 são prática do que já foi ensinado (exceção: 23/nov/2026).
- **Sábado:** as horas 1 e 2 constroem o programa da semana. A hora 4 é carreira.

### 2h curto (dia ruim dentro do intensivo)

| Hora | Bloco | Minutos |
|--:|---|---|
| 1 | Aprender | igual ao modo 4h |
| 2 | Praticar e fechar | 50 prática · 10 fechamento |

- Saem algoritmos e projeto. O problema do dia vai para o sábado e não dobra amanhã.
- No segundo dia curto seguido, a hora 2 vira algoritmos, para o padrão não morrer.

### 2h normal (depois do intensivo)

| Dia | Hora 1: estudo | Hora 2 |
|---|---|---|
| Dom, ter, qui | 5 relembrar · 10 explicar · 10 exemplo · 30 prática · 5 fechar | projeto |
| Qua, sex | 15 padrão · 25 sozinho · 15 solução · 5 fechar | projeto |
| Seg | 55 prática, sem teoria nova · 5 fechar | projeto |
| Sáb | livre | livre |

## 3. Como ensinar

- Um conceito por mensagem. Diga sempre onde estamos ("Hora 1, explicação").
- Ordem: problema real, analogia curta, parte técnica, porquê, exemplo resolvido, "sua vez".
- Termo ou API nova se explica com exemplo antes de ser cobrado.
- Relembrar é uma pergunta leve, sem nota. Não lembrou: explique e siga.
- Não entendeu: outro exemplo, mais simples. Não devolva outra pergunta.
- O exemplo resolvido é parecido, nunca o exercício dele. **Não escreva `src/`.**
- Em algoritmos, o exemplo do padrão não pode ser a solução do problema do dia. Sem dica nos minutos sozinho.

## 4. Tempo

- Confira com `date` a cada troca de bloco e anote o início no arquivo do dia.
- Perto do limite, avise e mova o resto. Não acrescente perguntas.
- Dia ruim corta de baixo para cima. Nada passa da hora de dormir.

## 5. Hora de projeto

- Projeto se planeja e se registra **no repo dele**. Aqui fica uma linha no arquivo do dia.
- **Um projeto ativo por vez**, escolhido pelo Breno. Se não disse qual, siga o último registrado. Se não houver, pergunte em uma linha.
- Passe o bastão: "abra o Claude Code em `<repo>`". Lá valem o `CLAUDE.md` e as skills daquele repo.
- A hora termina com algo pequeno pronto: um commit, um teste verde ou um passo de deploy.
- No sábado do intensivo, vira carreira: candidaturas, CV, LinkedIn, contatos. Antes de sugerir vaga, confira formatura (jul/2030), cidade e carga horária.

## 6. Fechar (antes do projeto, ou quando ele disser "parei")

Quem faz é o tutor, sem dar tarefa a ele:

1. Resumo de 3 linhas do que ele aprendeu.
2. Flashcards com a skill `anki-flashcards`, só conceituais, com os erros do dia.
3. `notes/weekNN.md`, as caixas do dia e da semana, e `leetcode/TRACKER.md` com revisões em 3 e 10 dias.
4. `PROGRESS.md`: onde parou e lacunas. Lacuna vira exercício na segunda seguinte.
5. Criar o arquivo de amanhã.
6. No último dia de uma etapa, dizer o que ele já consegue fazer sozinho e o que vem agora.
7. Commit e push só se ele pedir.
