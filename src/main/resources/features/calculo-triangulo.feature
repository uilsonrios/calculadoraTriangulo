# language: pt
Funcionalidade: Calculo de um triângulo

Esquema do Cenario: Valida os tipos de um triangulo
Dado que estou na pagina de calculo de triangulos
  E informo o primeiro lado do triangulo <lado1>
  E informo o segundo lado do triangulo <lado2>
  E informo o terceiro lado do triangulo <lado3>
Quando eu clico no botao calcular
Entao a seguinte texto deve ser exibido "<texto>"

Exemplos:
| lado1 | lado2 | lado3 | texto                 |
| 1     | 1     | 1     | Triângulo Equilátero  |
| 2     | 2     | 1     | Triângulo Isósceles   |
| 3     | 2     | 1     | Triângulo Escaleno    |