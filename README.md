# Hello Spring AI

This is a simple sample project to kickstart a Spring AI application.
It integrates with Azure OpenAI and Ollama.

The official documentation of the project is [here](https://docs.spring.io/spring-ai/reference/).

## Spring Project Initialization

* https://start.spring.io/

> 💡 Ideally chose a snapshot version to get the snapshots repositories configured.

## Azure Open AI

Quickly develop generative AI experiences with a diverse set of prebuilt and curated models from OpenAI, Meta and beyond.

### Deploy Model

* https://portal.azure.com/
  * Generate keys
  * Deploy Model

### Configure the Application

Configure Keys
```
spring.ai.azure.openai.api-key=xxx
spring.ai.azure.openai.endpoint=https://xxx.openai.azure.com/
spring.ai.azure.openai.chat.model=gpt-35-turbo-16k
```

Add dependency to the application
```
<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-azure-openai-spring-boot-starter</artifactId>
    <version>0.8.0-SNAPSHOT</version>
</dependency>
```

> 💡 Configuration parameters are available [here](https://docs.spring.io/spring-ai/reference/api/clients/openai.html#_getting_started).

## Local Development with Ollama

Get up and running with large language models, locally.

* https://ollama.ai/
* https://github.com/jmorganca/ollama

### Deploy Model

```
curl https://ollama.ai/install.sh | sh
ollama serve &
ollama list
ollama run orca-mini
```

### Configure the Application

Configure Keys
```
# We have to disable the autoconfiguration with this implementation yet
spring.main.web-application-type=none
spring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.model=orca-mini
```

Add dependency to the application
```
<dependency>
   <groupId>org.springframework.ai</groupId>
   <artifactId>spring-ai-ollama-spring-boot-starter</artifactId>
   <version>0.8.0-SNAPSHOT</version>
</dependency>
```

> 💡 Configuration parameters are available [here](https://docs.spring.io/spring-ai/reference/api/clients/ollama.html#_getting_started).

