## Doc

* https://docs.spring.io/spring-ai/reference/getting-started.html
* https://docs.spring.io/spring-ai/reference/api/clients/azure-openai.html#_gettting_started



## Spring Project Initialization

* https://start.spring.io/
  * 3.2.2 (SNAPSHOT)
  * hello-azure-open-ai

## Azure Open AI

* https://portal.azure.com/
  * Generate keys
  * Add dependency
  * Configure Keys

## Prompt

* https://github.com/scraly/developers-conferences-agenda

## Tuning

spring.ai.azure.openai.chat.temperature=0

```
The date of the events are defined as follows:
* The Month is defined in the ## level as the name
* The days are the first information of the line of the event
* It can be a single date, or a period
* All events have a date
```

## Local Dev

### Ollama

* https://ollama.ai/
* https://github.com/jmorganca/ollama

```
curl https://ollama.ai/install.sh | sh
ollama serve &
ollama list
ollama run orca-mini
```

### Spring AI

* https://docs.spring.io/spring-ai/reference/api/clients/ollama.html#_getting_started

```
<dependency>
   <groupId>org.springframework.ai</groupId>
   <artifactId>spring-ai-ollama-spring-boot-starter</artifactId>
   <version>0.8.0-SNAPSHOT</version>
</dependency>
```
Be carrefull needs spring-boot-starter-web at this time.

```
spring.ai.ollama.base-url=localhost:11434
spring.ai.ollama.model=orca-mini
```
