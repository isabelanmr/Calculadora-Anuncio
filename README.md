## Instruções de como compilar e executar o programa:

Windows: Após salvar o arquivo .java, pressione a tecla Win + R; digite cmd e tecle enter. Após isso digite os comandos a seguir:
### - cd Desktop:
o comando "cd" permite entrar no diretório "Desktop".


### - java -version:
Exibe a versão do Java instalado na máquina (comando opcional).


### - dir:
Lista todos os arquivos e pastas do diretório atual. É preciso identificar se está presente o Exemplo.java que irá compilar.


### - javac -cp . Exemplo.java:

•	O comando javac compila o arquivo Java.

•	O argumento -cp (classpath) destina em qual diretório a classe deverá ser armazenada, javac -cp . Exemplo.java equivale a javac Exemplo.java.

•	Exemplo.java é o arquivo que será compilado.

### - java Exemplo:

•	Esse comando tem como função chamar a JVM, que fará todos os passos de verificação para executar o programa escrito em Java.



## Instruções de utilização:

- No script Calculadora.java, dentro da pasta 'src', temos o cálculo da quantidade máxima de pessoas que visualizarão o mesmo anúncio, com a declaração das variáveis em questão;

- Após compilação, para a execução do programa, informar o valor investido no anúncio em reais;

- Ao final da execução do programa, serão calculados e recebidos os números de visualizações dos anúncios original e compartilhado e por fim, a quantidade máxima de visualizações total;

- No arquivo CalculadoraTeste.java é possível executar o teste unitário da calculadora de visualizações.
