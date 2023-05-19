# task-manager
## Sistema de Gerenciamento de Tarefas

O Sistema de Gerenciamento de Tarefas é um aplicativo desenvolvido em Java que permite aos usuários criar, atribuir e gerenciar tarefas. O objetivo principal deste sistema é facilitar a organização e acompanhamento das atividades a serem realizadas por uma equipe ou por indivíduos.

### Recursos e funcionalidades

O aplicativo possui as seguintes funcionalidades:

- Criação de tarefas: Os usuários podem criar novas tarefas especificando um título, descrição e responsável pela sua execução.
- Atribuição de tarefas: As tarefas podem ser atribuídas a usuários específicos, facilitando a distribuição de trabalho dentro da equipe.
- Gerenciamento de tarefas: Os usuários podem visualizar todas as tarefas existentes, marcar tarefas como concluídas e remover tarefas que não são mais necessárias.
- Filtragem de tarefas: O sistema permite aos usuários filtrar as tarefas por responsável, facilitando a visualização das tarefas atribuídas a um determinado usuário.
- Marcação de tarefas como concluídas: Os usuários podem marcar as tarefas como concluídas, ajudando a acompanhar o progresso das atividades.
- Persistência de dados: As tarefas são armazenadas em memória durante a execução do programa, mas podem ser facilmente adaptadas para serem armazenadas em um banco de dados ou em arquivos.

### Como executar o aplicativo

Para executar o aplicativo, siga as seguintes etapas:

1. Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
2. Compile os arquivos Java utilizando o comando `javac`:
   ```
   javac Main.java Task.java TaskManager.java
   ```
3. Execute o programa com o comando `java`:
   ```
   java Main
   ```

### Possíveis melhorias e recursos adicionais

Este projeto de sistema de gerenciamento de tarefas pode ser expandido e aprimorado de várias maneiras. Alguns recursos adicionais que podem ser implementados incluem:

- Autenticação de usuário: Adicionar um sistema de login e autenticação para garantir que apenas usuários autorizados possam acessar e gerenciar as tarefas.
- Notificações por e-mail: Implementar a funcionalidade de enviar notificações por e-mail para os usuários sobre novas tarefas atribuídas, tarefas vencidas ou outras atualizações relevantes.
- Funcionalidades de busca e filtragem avançadas: Adicionar recursos de pesquisa mais complexos, como busca por palavras-chave, filtragem por data de vencimento, prioridade, etc.
- Interface gráfica: Desenvolver uma interface gráfica mais amigável e intuitiva para facilitar a interação com o sistema de gerenciamento de tarefas.

Essas são apenas algumas ideias para melhorar o sistema. A implementação desses recursos adicionais depende dos requisitos específicos do projeto e do contexto de uso.