# externalised properties
How to use external property file in spring boot

* Create a new placeholder.properties file in resources.
* For the class which is going to consume the values from this properties file, add the 2 annotations ->@Configuration and @PropertySource("classpath:placeholder.properties")
* Now you can use the values from placeholder.properties file in this class
