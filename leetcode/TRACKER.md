# LeetCode Tracker

Método: 30 min sem ajuda. Travou → lê a solução, fecha, reescreve do zero.
Revisão no dia 3 e no dia 10: reescrever do zero, sem olhar.

| #   | Problema           | Padrão           | Data       | Sozinho? | Rev. D+3      | Rev. D+10     | Nota                    |
|-----|--------------------|------------------|------------|----------|---------------|---------------|-------------------------|
| 1   | Two Sum            | Arrays & Hashing | 2026-10-28 | ✅       | 2026-10-31 ✅ | 2026-11-09 ✅ (2 dias atrasada) | HashMap complemento → índice, 1 passada. D+10: lógica certa do zero, mas criado fora do `src` sem `package`/imports; complexidade certa sem o porquê. Força bruta: O(n²) tempo, O(1) espaço. Hash map: O(n) tempo, O(n) espaço |
| 217 | Contains Duplicate | Arrays & Hashing | 2026-10-31 | ✅       | 2026-11-03 ✅ | 2026-11-10 ✅ | HashSet dos já vistos, 1 passada. Força bruta: O(n²) tempo, O(1) espaço. HashSet: O(n) tempo, O(n) espaço |
| 242 | Valid Anagram      | Arrays & Hashing | 2026-11-11 | ✅       | 2026-11-16 ✅ (2 dias atrasada) | 2026-11-21    | Tamanho igual, conta as letras de `s` no `HashMap`, desconta as de `t` (`false` se faltar). ~29 min sozinho. 1ª versão O(n²) sem perceber (`toLowerCase()` no laço); espaço chutado O(n). Ordenar as duas: O(n log n) tempo. Contagem: O(n) tempo, O(1) espaço (26 letras). D+3 (outra máquina): sozinho com `HashMap`; depois o tutor mostrou o `int[26]` com `c - 'a'` (mesmo Big-O, constante menor) |
| 49  | Group Anagrams     | Arrays & Hashing | 2026-11-17 | ⚠️ 30 min sozinho + ajuda nos bugs | 2026-11-20 | 2026-11-27 | Força bruta: para cada palavra sem grupo, abre um grupo e testa as que sobram com o `isAnagram` do #242, tirando da cópia quem entra. Vermelho com 2 bugs de remover enquanto anda por índice e `strs[i]` vs `copy.get(i)`; verde (2 testes) com ajuda, ~20 min além dos 30. Tempo chutado O(n · k), é O(n² · k) (laços aninhados); espaço O(n). D+3: tentar com `HashMap` (que chave junta os anagramas?) |

## Resumo do mês
- Resolvidos: 4 · Sozinho: 3 (75%)
