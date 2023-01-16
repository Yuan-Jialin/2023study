
此实例解决属性名和数据库中字段名不一致的问题

本例中 user类中 是password 而数据库中是pwd
不一致

**解决方法一**：起别名
```sql
select id,name,pwd as password from  User;

```
但需要每一句涉及pwd的sql都去改
**解决方法二**：resultMap
结果集映射

```xml
<resultMap id="UserMap" type="User">
        <result column="id" property="id"/>
        <result column="name" property="name"/>
        <result column="pwd" property="password"/>
    </resultMap>
```
type 是对应的类名 
column是数据库里的名字 property 是类里属性的名字



