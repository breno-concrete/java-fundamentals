# LeetCode Tracker

Método: 30 min sem ajuda. Travou → lê a solução, fecha, reescreve do zero.
Revisão no dia 3 e no dia 10: reescrever do zero, sem olhar.

| #   | Problema           | Padrão           | Data       | Sozinho? | Rev. D+3      | Rev. D+10     | Nota                    |
|-----|--------------------|------------------|------------|----------|---------------|---------------|-------------------------|
| 1   | Two Sum            | Arrays & Hashing | 2026-10-28 | ✅       | 2026-10-31 ✅ | 2026-11-09 ✅ (2 dias atrasada) | HashMap complemento → índice, 1 passada. D+10: lógica certa do zero, mas criado fora do `src` sem `package`/imports; complexidade certa sem o porquê. Força bruta: O(n²) tempo, O(1) espaço. Hash map: O(n) tempo, O(n) espaço |
| 217 | Contains Duplicate | Arrays & Hashing | 2026-10-31 | ✅       | 2026-11-03 ✅ | 2026-11-10 ✅ | HashSet dos já vistos, 1 passada. Força bruta: O(n²) tempo, O(1) espaço. HashSet: O(n) tempo, O(n) espaço |
| 242 | Valid Anagram      | Arrays & Hashing | 2026-11-11 | ✅       | 2026-11-14    | 2026-11-21    | Tamanho igual, conta as letras de `s` no `HashMap`, desconta as de `t` (`false` se faltar). ~29 min sozinho. 1ª versão O(n²) sem perceber (`toLowerCase()` no laço); espaço chutado O(n). Ordenar as duas: O(n log n) tempo. Contagem: O(n) tempo, O(1) espaço (26 letras) |

## Resumo do mês
- Resolvidos: 3 · Sozinho: 3 (100%)
