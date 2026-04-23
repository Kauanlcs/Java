readme.md
<!DOCTYPE html>
<html>
<head>

</head>
<body>

</table>

<!-- FUNDAMENTOS (1-4) -->
<h2 style="color: #27ae60;"> FUNDAMENTOS BÁSICOS</h2>

<details class="fundamental">
<summary>📌 ATIVIDADE 1 - JavaIDADE</summary>
<div>
    <div class="objetivo">
        <b>Objetivo:</b> Calcular a idade de uma pessoa baseada no ano de nascimento.
    </div>
    <h3>Como funciona:</h3>
    <ul>
        <li><code>Scanner sc = new Scanner(System.in);</code></li>
        <li>Pede o nome do usuário → <code>String nome</code></li>
        <li>Pede o ano de nascimento → <code>int anoNascimento</code></li>
        <li>Calcula: <code>int idade = 2026 - anoNascimento;</code></li>
        <li>Mostra: <code>"Olá " + nome + ", você tem " + idade + " anos"</code></li>
    </ul>
    <div class="exemplo">
        <b>Exemplo:</b>
        <pre>Digite seu nome: Maria
Digite seu ano de nascimento: 1990
Olá Maria, você tem 36 anos de idade</pre>
    </div>
</div>
</details>

<details class="fundamental">
<summary>📌 ATIVIDADE 2 - AREADOQUADRADO</summary>
<div>
    <div class="objetivo">
        <b>Objetivo:</b> Revelar o tamanho da área do quadrado.
    </div>
    <h3>Como funciona:</h3>
    <ul>
        <li>Pede lado → <code>double lado = sc.nextDouble();</code></li>
        <li>Calcula: <code>double area = lado * lado;</code></li>
        <li>Mostra resultado</li>
    </ul>
    <div class="exemplo">
        <pre>Digite o lado do quadrado: 5.5
A área do quadrado é: 30.25</pre>
    </div>
</div>
</details>

<details class="fundamental">
<summary>📌 ATIVIDADE 3 - AREDORETANGULO</summary>
<div>
    <div class="objetivo">
        <b>Objetivo:</b> Calcular a área do retângulo.
    </div>
    <h3>Como funciona:</h3>
    <ul>
        <li><code>double base = sc.nextDouble();</code></li>
        <li><code>double altura = sc.nextDouble();</code></li>
        <li><code>double area = base * altura;</code></li>
    </ul>
    <div class="exemplo">
        <pre>A área do retângulo é: 40.0</pre>
    </div>
</div>
</details>

<details class="fundamental">
<summary>📌 ATIVIDADE 4 - DIFERENCAIDADE</summary>
<div>
    <div class="objetivo">
        <b>Objetivo:</b> Calcular diferença absoluta de idades.
    </div>
    <h3>Como funciona:</h3>
    <ul>
        <li>2 pessoas: nome + idade</li>
        <li><code>Math.abs(idade1 - idade2)</code></li>
        <li>Resultado sempre positivo</li>
    </ul>
    <div class="exemplo">
        <pre>A diferença entre João(25) e Ana(30) é: 5 anos</pre>
    </div>
</div>
</details>

<!-- ESTRUTURAS DE CONTROLE (5-8) -->
<h2 style="color: #ff1900;"> ESTRUTURAS DE CONTROLE</h2>

<details class="avancado">
<summary>📌 ATIVIDADE 5 - TABUADA</summary>
<div>
    <div class="objetivo">
        <b>Objetivo:</b> Tabuada completa (1 a 10) → <b>FOR</b>
    </div>
    <h3>Como funciona:</h3>
    <ul>
        <li><code>for (int i = 1; i <= 10; i++)</code></li>
        <li><code>numero + " x " + i + " = " + (numero * i)</code></li>
    </ul>
    <div class="exemplo">
        <pre>5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50</pre>
    </div>
</div>
</details>

<details class="avancado">
<summary>📌 ATIVIDADE 6 - IMC</summary>
<div>
    <div class="objetivo">
        <b>Objetivo:</b> Classificar IMC → <b>IF/ELSE</b>
    </div>
    <h3>Como funciona:</h3>
    <ul>
        <li><code>imc = peso / (altura * altura)</code></li>
        <li>6 faixas com <code>if/else if/else</code></li>
    </ul>
    <div class="exemplo">
        <pre>Seu IMC é: 22.86
Peso ideal</pre>
    </div>
</div>
</details>

<details class="avancado">
<summary>📌 ATIVIDADE 7 - INTERVALOPARIMPAR</summary>
<div>
    <div class="objetivo">
        <b>Objetivo:</b> Pares/ímpares decrescente → <b>FOR + IF</b>
    </div>
    <h3>Como funciona:</h3>
    <ul>
        <li><code>for (int i = n2; i >= n1; i--)</code></li>
        <li><code>i % 2 == 0</code> (par) / <code>!= 0</code> (ímpar)</li>
    </ul>
    <div class="exemplo">
        <pre>20 18 16 14 12 10</pre>
    </div>
</div>
</details>

<details class="avancado">
<summary>📌 ATIVIDADE 8 - DIVISAOCONTROLADA</summary>
<div>
    <div class="objetivo">
        <b>Objetivo:</b> Validação → <b>DO-WHILE</b>
    </div>
    <h3>Como funciona:</h3>
    <ul>
        <li><code>do { ... } while (numero % primeiro == 0);</code></li>
        <li>Executa 1x + verifica condição</li>
    </ul>
    <div class="exemplo">
        <pre>Número inválido digitado. Encerrando...</pre>
    </div>
</div>
</details>

</body>
</html>