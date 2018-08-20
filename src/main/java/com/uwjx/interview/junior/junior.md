### JAVA实习生面试题

###### 第1题 阅读一下程序，计算 a,b,c的值。
```
        int a = 8;
        int b = a--;
        int c = 0;
        if(a > b & ++c > 0){
            a--;
            b--;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
```
###### 第2题 下面程序的输出结果是什么？
```
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.err.println(str1 == str2);  
```
##### 第3题  描述 String 和 StringBuilder、StringBuffer 的区别?



##### 第4题 解释内存中栈（stack）、堆(heap)和静态存储区的用法，并结合原理对以下语句做解释。
```
        String name = new String(“hello”);
```

