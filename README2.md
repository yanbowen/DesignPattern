#23种设计模式01
---
###一、策略模式
>（策略模式使用的就是面向对象的继承和多态机制）  
  
#####1. 定义：定义一组算法，将每个算法都封装起来，并且使它们之间可以互换。  
#####2. 策略模式三个角色   
* Context封装角色：起承上启下封装作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
* Strategy抽象策略角色：策略、算法家族的抽象，通常为接口。  
* ConcreteStrategy具体策略角色：实现抽象策略中的操作。  
  
#####3. 优点   
* 算法可以自由切换
* 避免使用多重条件判断
* 扩展性良好（符合OPC原则）  
  
#####4. 缺点   
* 策略类数量增多  
* 所以的策略类都需要对外暴露  
  
#####5. 使用场景  
* 多个类只有在算法或行为上稍有不同的场景。  
* 算法需要自由切换的场景。
* 需要屏蔽算法规则的场景。   
#####6. 策略枚举  
* 把原有定义在抽象策略中的方法移植到枚举中，每个枚举成员就成为了一个具体策略。(Calculator.ADD.exec(a,b))  

  
###二、工厂模式
>（工厂模式中，抽象产品类Product负责定义产品的共性，实现对事物最抽象的定义；Creator为抽象创建类，也就是抽象工厂，具体如何创建产品类是由具体的实现工厂ConcreteCreator完成的。）  
  
#####1. 定义：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。  
#####2. 优点：  
* 良好的封装性，代码结构清晰，降低了模块之间的耦合性。
* 扩展性非常优秀，在新增加产品类的情况下，只要适当地修改具体的工厂类或扩展一个工厂类，就可以完成___“拥抱变化”___。  
* 屏蔽产品类，不论产品类的实现如何变化，只要接口保持不变，系统中的上层模块就不要发生变化。
* 工厂模式是典型的解耦框架。符合__迪米特法则__，我不需要的就不要去交流；也符合__依赖倒置原则__，只依赖产品类的抽象；当然也符合__里氏替代原则__，使用子类替换产品父类。   

#####3. 使用场景：
* 工厂方法模式是new一个对象的替代品，所以在所有需要生成对象的地方都可以使用，但是需要慎重地考虑是否要增加一个工厂类进行管理，增加代码的复杂度。
  
###三、观察者模式
>(观察者模式(Observer Pattern)也叫做发布订阅模式(Publish/subscribe))  
  
#####1. 定义：定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所以依赖于它的对象都会得到通知并被自动更新。
* Subject被观察者：定义被观察者必须实现的职责，它必须能够动态地增加、取消观察者。它一般是抽象类或者是实现类，仅仅完成作为被观察者必须实现的职责：管理观察者并通知观察者。
* Observer观察者：观察者接收到消息后，即进行update（更新方法）操作，对接收到的信息进行处理。  
* ConcreteSubject具体的被观察者：定义被观察者自己的业务逻辑，同时定义对哪些事件进行通知。
* ConcreteObserver具体的观察者：每个观察者在接收到消息后的处理反应是不同，各个观察者有自己的处理逻辑。  
  
#####2. 优点：
* 观察者和被观察者之间是抽象耦合：如此设计，则不管是增加观察者还是被观察者都非常容易扩展，而且在Java中都已经实现的抽象层级的定义，在系统扩展方面更是得心应手。
* 建立一套触发机制：根据单一职责原则，每个类的职责是单一的，那么怎么把各个单一的职责串联成真实世界的复杂的逻辑关系呢？观察者模式就可以形成一个触发机制，完美实现链条形式。
  
#####3. 缺点：
* 观察者模式需要考虑开发效率和运行效率问题，一个被观察者，多个观察者，开发和调试就会比较复杂，而且Java中消息的通知默认是顺序执行，一个观察者卡壳，会影响整体的执行效率。这种情况下，一般考虑采用异步的方式。
* 多级触发时的效率更是让人担忧。  
  
#####4. 使用场景：
* 关联行为场景。需要注意，关联行为是可以拆分的，而不是_“组合”_，关系。
* 事件多级触发场景。
* 跨系统的消息交换场景，如消息队列的处理机制。  
  
#####5. 注意事项：
* 广播链的问题：  一个观察者可以有双重身份，即是观察者，又是被观察者，但是链一旦建立，这个逻辑就比较复杂，可维护性非常差，根据经验建议，在一个观察者模式中最多出现一个对象既是观察者又是被观察者，也就是说消息最多转发一次(传递两次)
  
###四、适配器模式
>(适配器模式(Adapter Pattern)又叫变压器模式，也叫做包装模式(Wrapper)，包装模式不止一个。适配器模式就是把一个接口或类转换成其他的接口或类)   
  
#####1. 定义：将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
* Target目标角色：该角色定义把其他类转换为何种接口，也就是我们期望接口。  
* Adaptee源角色：
* Adapter适配器角色：  
  
#####2. 优点：
* 适配器模式可以让两个没有任何关系的类在一起运行，只要适配器这个角色能够满足他们就行；
* 增加了类的透明性；
* 提高了类的复用度；
* 灵活性非常好；
  
#####3. 使用场景：
* 适配器模式最好在详细设计阶段不要考虑它，它不是为了解决还处于开发阶段的问题，而是解决正在服役的项目问题，主要应用场景是扩展应用，系统扩展了，不符合原有设计的时候才考虑通过适配器模式减少代码修改带来的风险。  
  
###五、装饰模式  
  
#####1. 定义：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活。  
  
#####2. 优点：  
* 装饰模式和被装饰类可以独立发展，而不会相互耦合。  
* 装饰模式是继承关系的一个替代方案。  
* 装饰模式可以动态地扩展一个实现类的功能。  
  
#####3. 缺点：  
* 多层装饰是比较复杂的，因此要尽量减少装饰类的数量，以便降低系统的复杂度。  
  
#####4. 使用场景：  
* 需要扩展一个类的功能，或给一个类增加附加功能。
* 需要动态地给一个对象增加功能，这些功能可以再动态地撤销。
* 需要为一批的兄弟类进行改装或加装功能。  
  
###六、单例模式  
  
#####1. 定义：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。  
  
#####2. 优点：  
* 由于单例模式在内存中只有一个实例，减少了内存开支，特别是一个对象需要频繁地创建、销毁时，而且创建或销毁时性能又无法优化，单例模式的优势就非常明显。    
* 由于单例模式只生成一个实例，所以减少了系统的性能开销，当一个对象的产生需要比较多的资源时，则可通过在应用启动时直接产生一个单例对象，然后永久驻留内存的方式来解决。
* 单例模式可以避免对资源的多重占用，例如一个写文件动作，由于只有一个实例存在内存中，避免对同一个资源文件的同时写操作。
* 单例模式可以在系统设置全局的访问点，优化和共享资源访问。