package org.example.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    private int id;
    private String name;
      /*private int tid;
      * 数据库中虽然是这样通过tid关联一个老师
      * 但如果java中也通过tid，就没什么意义了
      * 因为java中不比mysql这种关系型数据库，可以通过tid很快找到老师
      *所以java中要直接写老师的类
      * */
    private Teacher teacher;
}
