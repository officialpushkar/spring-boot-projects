

# Spring Boot CACHE application using MAP based Jdk Cache

>@Cacheable

>@CachePut

>@CacheEvict

---

## Table of Contents (Optional)

> If your `README` has a lot of info, section headers might be nice.

- [Installation](#installation)
- [Features](#features)
- [Contributing](#contributing)
- [FAQ](#faq)
- [Support](#support)
- [License](#license)


---

## Example (Optional)

```javascript
// code away!

package com.javashastra.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCacheJdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheJdkApplication.class, args);
	}

}


```

---

## Installation

- Just Clone this repo
- Run mvn clean

### Clone

- Clone this repo to your local machine using `https://github.com/techbulletinprime/spring-boot-cache-jdk`

### Setup

---

## Features
---
Spring Boot Provides awesome cache features. SO we no need to use custom  cache and taking care of the boiler plate logic.
and it's over burden.There are multiple cache implementations are there like . ehCache,Redis,Guava . any of these implementation.
We can use by providing the particular dependency in pom.
Core annotations provided by Spring.
@EnableCache: Enables Spring's annotation-driven cache management capability,
- Spring Doc at <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/cache/annotation/EnableCaching.html" target="_blank">`Spring Doc`</a>
@Cacheable : This we can place at method level , whose return value you want to put into cache.
- Spring Doc : Spring Doc at <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/cache/annotation/Cacheable.html" target="_blank">`Spring Doc`</a>
@CacheEvict: you can place this annotation on method level. If you are annotating  a method with this annotation and calling that method.
It will remove the entire cache.
- Spring Doc : Spring Doc at <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/cache/annotation/CacheEvict.html" target="_blank">`Spring Doc`</a>

## Usage (Optional)
- Where ever you want to implement cache you can use this Spring Cache .
## Documentation (Optional)

## Tests (Optional)

---

## Contributing

> To get started...

### Step 1

- **Option 1**
    - 🍴 Fork this repo!

- **Option 2**
    - 👯 Clone this repo to your local machine using `https://github.com/techbulletinprime/spring-boot-cache-jdk`

### Step 2

- **HACK AWAY!** 🔨🔨🔨

### Step 3

- 🔃 Create a new pull request.

---
---

## FAQ

- **How do I do *specifically* so and so?**
    - No problem !feel free to reachout to me.

---

## Support

Reach out to me at one of the following places!

- Facebook at <a href="https://www.facebook.com/rajanikanta.pradhan1" target="_blank">`Rajanikanta`</a>
- Youtube at <a href="https://www.youtube.com/c/javashastra" target="_blank">`@Java Shastra`</a>


---


## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
