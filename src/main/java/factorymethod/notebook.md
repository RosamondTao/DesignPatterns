## 工厂模式

### 定义
任何可以产生对象的方法或类，都可以称之为工厂
单例也是一种工厂
工厂是用来灵活控制生产过程的，可以理解为一种new的自定义

### 举例

任意定制交通工具
    实现Moveable
任意定制生产过程
    MXXXFactory.create()
任意定制产品一族
    (抽象工厂实现)


### +++
生产的产品有个更高级的统一接口。