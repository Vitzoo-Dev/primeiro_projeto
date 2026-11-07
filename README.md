
# ☕ Exercícios em Java

Repositório com exercícios práticos desenvolvidos em **Java**, organizados por assunto e numerados para acompanhar minha evolução nos estudos. O objetivo é praticar lógica de programação, fundamentos da linguagem e conceitos de orientação a objetos.

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20andamento-yellow)

---

## 📚 Sumário

- [Sobre o projeto](#-sobre-o-projeto)
- [Conteúdos praticados](#-conteúdos-praticados)
- [Estrutura do repositório](#-estrutura-do-repositório)
- [Tecnologias e requisitos](#-tecnologias-e-requisitos)
- [Como clonar](#-como-clonar)
- [Como executar um exercício](#-como-executar-um-exercício)
- [Como contribuir](#-como-contribuir)
- [Autor](#-autor)

---

## 🎯 Sobre o projeto

Este repositório reúne exercícios resolvidos durante meus estudos de Java. Cada arquivo apresenta uma proposta prática e uma implementação, permitindo revisar conceitos, experimentar soluções e acompanhar minha evolução na programação.

O projeto está em desenvolvimento e novos exercícios podem ser adicionados ou aprimorados ao longo do aprendizado.

## 🧠 Conteúdos praticados

- Fundamentos: variáveis, tipos de dados, operadores e entrada/saída com `Scanner`
- Estruturas condicionais: `if`, `else` e `switch`
- Estruturas de repetição: `for`, `while` e `do-while`
- Vetores e matrizes
- Manipulação de strings
- Métodos, parâmetros e sobrecarga
- Orientação a objetos: classes, encapsulamento, herança, polimorfismo e interfaces
- Tratamento de exceções
- Coleções: `List`, `Set` e `Map`
- Manipulação de arquivos
- Streams, expressões lambda e interfaces funcionais

## 📁 Estrutura do repositório

Os exercícios estão organizados dentro da pasta `src`, separados por assunto:

```text
primeiro_projeto/
├── src/
│   ├── Arquivos/
│   ├── Básico/
│   ├── Coleções/
│   ├── Condicionais/
│   ├── Exceções/
│   ├── Métodos/
│   ├── OrientaçãoObjetos/
│   ├── Repetição/
│   ├── StreamsLambda/
│   ├── Strings/
│   └── Vetores-Matrizes/
└── README.md
```

Cada pasta contém os exercícios daquele tema. Os arquivos são numerados para facilitar a identificação e a sequência de estudos.

## 🛠️ Tecnologias e requisitos

- **Java 17 ou superior**
- **JDK** instalado e configurado
- IDE recomendada: [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/) ou [Visual Studio Code](https://code.visualstudio.com/) com as extensões para Java

Para conferir se o Java está instalado, execute no terminal:

```bash
java -version
javac -version
```

## 📥 Como clonar

No terminal, execute:

```bash
git clone https://github.com/Vitzoo-Dev/primeiro_projeto.git
cd primeiro_projeto
```

## ▶️ Como executar um exercício

Os arquivos utilizam declarações de pacote (`package`). Por isso, compile a partir da pasta raiz do projeto, mantendo a estrutura de diretórios.

Exemplo com o primeiro exercício da pasta **Arquivos**:

1. Compile o arquivo:

```bash
javac -encoding UTF-8 -d out src/Arquivos/Arquivos01.java
```

2. Execute a classe:

```bash
java -cp out Arquivos.Arquivos01
```

Para executar outro exercício, substitua o caminho do arquivo e o nome completo da classe pelo exercício desejado. O nome completo inclui o pacote declarado no início do arquivo.

**Dica:** também é possível abrir a pasta do projeto em uma IDE, localizar a classe desejada e executar seu método `main`.

## 🤝 Como contribuir

Sugestões e contribuições são bem-vindas!

1. Faça um **fork** deste repositório.
2. Crie uma branch para sua alteração:

   ```bash
   git checkout -b novo-exercicio
   ```

3. Faça suas alterações e registre um commit:

   ```bash
   git add .
   git commit -m "Adiciona exercício sobre listas"
   ```

4. Envie a branch para seu fork:

   ```bash
   git push origin novo-exercicio
   ```

5. Abra um **Pull Request**.

### Padrões sugeridos

- Mantenha os exercícios organizados por assunto.
- Numere os arquivos seguindo a sequência existente.
- Inclua o enunciado no início do arquivo.
- Utilize nomes de classes em PascalCase e variáveis/métodos em camelCase.
- Prefira comentários que expliquem decisões ou trechos importantes do código.

## 👤 Autor

**Victor Martins — Vitzoo-Dev**

- GitHub: [@Vitzoo-Dev](https://github.com/Vitzoo-Dev)
- LinkedIn: [Victor Martins](https://www.linkedin.com/in/victor-martins-645119276/)

---

⭐ Se este repositório te ajudou ou se você gostou da proposta, deixe uma estrela!
