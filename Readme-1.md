# To do Today


## 25 August 2025
-> What is Spring?

Main Class - 

Spring in Spring boot

#### Wat Spring Do for us? 

1) **I don't want control of every class** so i give access to spring that will make an obj of those classes in heap and then i can call it . this object will be saved in ioc container and numbers will be made as directed not more than the number of objects specified and then of more objects are called then it will refer to same objects only don't make new ones. 
    * Objects made by spring are called beans. classes is named component
    *  **How to get Beans**
    1) 
    ``` ApplicationContext cntxt = SpringApplication.run(SprintBoot01Application.class, args);
   System.out.println("Hello Spring!!!");
   
   //		Pulsar plsr = new Pulsar();		//How to get Beans 		Pulsar plsr = cntxt.getBean(Pulsar.class); 		plsr.speed();}
   ```
   2) Autowiring
   
   3) Autowiring classes in another class like pulsar done in bike class

Beecoder
Anuj Bhai 
Code with Drugesh
