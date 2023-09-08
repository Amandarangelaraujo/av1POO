# av1POO
Questão sobre a garagem.

 1. Questãoo ´unica (10,0 pontos):
você foi contratado para desenvolver um sistema de gest˜ao carros de luxo em uma garagem. Sabe-se que cada cliente
desta empresa pode possuir mais de 10 carros, desta maneira, seu gestor pediu que o algoritmo fosse constru´ıdo
utilizando os conhecimentos obtidos na primeira etapa da disciplina de Programa¸c˜ao Orientada a Objeto. Isto posto,
fa¸ca o que se pede:
• [1,0 ponto(s)] Construa uma classe chamada Cliente que possua os atributos referente a nome, idade e
renda anual, bem como seus m´etodos getters e setters.
• [3,5 ponto(s)] Construa uma classe referente a um Carro que possua:
1. [0,5 ponto(s)] atributos referente a marca, modelo, cor do carro e seu pre¸co atual.
2. [2,0 ponto(s)] A presente classe faz a modifica¸c˜ao desses atributos apenas no momento da instˆancia do
objeto. Desta maneira, apenas existem getters.
3. [1,0 ponto(s)] Crie um m´etodo para que retorne uma string organizada com todas as informa¸c˜oes do
carro (cada um de seus atributos).
• [5,0 ponto(s)] Construa uma classe referente a uma Garagem que possua os seguintes membros:
1. [0,5 ponto(s)] Os atributos cliente, carros, pre¸co do carro mais valioso, pre¸co do carro menos valioso e
valor total.
2. [1,5 ponto(s)] Crie um construtor que receba como parˆametro o cliente e os carros. No corpo deste
construtor, al´em de modificar os atributos cliente e carros, construa uma l´ogica para modificar os atributos
pre¸co do carro mais valioso, pre¸co do carro menos valioso e valor total
3. [1,5 ponto(s)] Crie um m´etodo privado chamado calcularMensalidade que retorna o c´alculo de mensalidade do cliente baseado em um valor fixo de R$3500,00 por cada carro alugado mais 0,5% do valor total
dos carros para aquele cliente.
4. [1,0 ponto(s)] Crie um m´etodo privado que realiza a ordena¸c˜ao dos carros pelo pre¸co em ordem crescente.
5. [0,5 ponto(s)] Construa um m´etodo chamado imprimirFatura que cont´em em seu corpo a chamada do
m´etodo que realiza a ordena¸c˜ao dos carros e em seguida, faz a exibi¸c˜ao no console das informa¸c˜oes de cada
carro, do cliente e o valor total a ser pago.
• [0,5 ponto(s)] O programa principal(main) deve conter:
1. A instˆancia do objeto referente a um cliente. Fa¸ca tamb´em o cadastro de seu nome, idade e renda anual.
2. Levando em considera¸c˜ao que o presente cliente possui 5 carros de luxo, realize o cadastro de cinco carros.
3. O cadastro de uma garagem e em seguida a chamada do m´etodo imprimirFatura.

