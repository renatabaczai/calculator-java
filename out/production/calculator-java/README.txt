# Raport Analiză Cod - calculator-java

## 1. Linii de cod (LOC)
- Total LOC: **147 linii**
- Total Calculator.java : 128 linii de cod, 5 linii de comentariu, 54 de linii goale
- Total Start.java: 19 linii de cod, 0 linii de comentariu, 7 linii goale

## 2. Complexitate Ciclomatică și Cognitivă
Metodă                                         | Complexitate Ciclomatică | Complexitate Cognitivă

Calculator.Calculate(list<Float>, List<String> | 12                       | 23
Calculator.evaluateExpression(String)          | 12                       | 14
Calculator.Operations.Operations()             | 1                        | 0
Calculator.Operations.ToString()               | 1                        | 0
Calculator.Run(String)                         | 1                        | 0
Start.main(String[])                           | 3                        | 4

3. Analiza statică
a. Calculator.java - Linie 18...................metoda ToString nu e scrisa corect
b. Calculator.java - Linie 4....................Constructorul este public
c. Calculator.java - Linie 18...................numele metodei este gresita
d. Calculator.java - Linie 24...................numele metodei este gresita
e. Calculator.java - Linie 70...................returneaza direct expresia data si nu cea din variabila
f. Calculator.java - Linie 74...................numele metodei este gresita                                                        |
g. Start.java      - Linie 8....................Replace this use of System.out by a logger
h. Start.java      - Linie 19...................Replace this use of System.out by a logger
i. Start.java      - Linie 6....................denumirea variabilei nu corespunde cu expresia

4. Recomandare
- se recomanda adaugarea constructorului "Calculator" in privat si de a nu fi public
- numele metodelor se scriu cu litere mici
- imbunatatirea codului prin mai multe comentarii