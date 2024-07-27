Adicionei uma nova funcionalidade ao projeto Spring utilizando o padrão de projeto Strategy para o cálculo de frete.

Essa funcionalidade permite calcular o frete de diferentes maneiras, utilizando estratégias distintas, como frete normal, Sedex e express.

O que torna o sistema mais flexível e modular, permitindo a adição de novas estratégias de cálculo de frete sem a necessidade de modificar a lógica principal do sistema.

Estrutura do projeto

lb-padroes-projeto-spring-main
│
├── .mvn
│   └── wrapper
│       ├── maven-wrapper.jar
│       ├── maven-wrapper.properties
│       └── MavenWrapperDowlader.java
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── one
│   │   │       └── digitalinnovation
│   │   │           └── gof
│   │   │               ├── controller
│   │   │               │   └── ClienteRestController.java
│   │   │               ├── model
│   │   │               │   ├── Cliente.java
│   │   │               │   ├── ClienteRepository.java
│   │   │               │   ├── Endereco.java
│   │   │               │   └── EnderecoRepository.java
│   │   │               ├── service
│   │   │               │   ├── FreteStrategy.java
│   │   │               │   ├── FreteService.java
│   │   │               │   ├── ViaCepService.java
│   │   │               │   ├── ClienteService.java
│   │   │               │   └── impl
│   │   │               │       ├── ClienteServiceImpl.java
│   │   │               │       ├── NormalFreteStrategy.java
│   │   │               │       ├── SedexFreteStrategy.java
│   │   │               │       └── ExpressFreteStrategy.java
│   │   │               └── Application.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── templates (se aplicável)
│   └── test
│       └── java
│           └── one
│               └── digitalinnovation
│                   └── gof
│                       └── LabPadroesProjetoSpringApplicationTests.java
│
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
