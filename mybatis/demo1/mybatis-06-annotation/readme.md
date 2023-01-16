
实际开发中几乎不用注解

注解开发的本质是底层调用反射


mybatisUtils中
```java
 public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);//自动提交事务
    }
```
参数设置为true代表自动提交事务


多参数不想用mapper如果查询语句简单可以用如下方法
```java
 @Select("Select * from user where id=#{id} and name=#{name};")
    List<User> getUsersByNameAndId(@Param("id")int id,@Param("name") String name);
```
**_特别注意 引用类型不能加param注解_**
如果只有一个基本类型可以忽略，但建议都加上
