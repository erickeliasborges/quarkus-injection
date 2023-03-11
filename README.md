<h1 align="center">:file_cabinet: Quarkus injection!</h1>

## :memo: Descrição
Projeto de exemplo das principais injeções que o Quarkus disponibiliza.

- <b>@ApplicationScoped</b> - Esse Bean é utilizado para quando for necessário possuir apenas uma instância na aplicação, com uma vantagem de que utiliza um cliente proxy que gerencia a criação da classe pela chamada dos métodos, a classe só é instanciada quando um método é chamado, isso é chamado de lazy-loading, ou carregamento preguiçoso. Portanto, se a classe for injetada em outra, se ao chamar essa classe que injeta o ApplicationScoped e ela não chamar nenhum método, a classe injetada não irá ser instanciada.

- <b>@Singleton</b> - Esse Bean é parecido com o ApplicationScoped, porém não utiliza um cliente proxy e não é lazy-loading, ao injetá-lo, será criado uma instância para toda a aplicação da mesma forma que o ApplicationScoped, porém já vai ser instanciado só de estar injetado na classe.

- <b>@Dependent</b> - Esse Bean é o oposto dos acima, ele é instanciado e destruído na classe que o injeta. Portanto, se houver 2 injeções de um bean Dependent, haverá 2 instâncias e lógico, não compartilham informações.

- <b>@RequestScoped</b> - Esse Bean é utilizado normalmente para criar os endpoints, ele é instanciado no início da requisição HTTP e destruído no fim dela.
