# mybatis generator 逆向工程
## generator-config 为逆向工程配置模块或启动模块
## generator-target 为逆向工程生成目标文件的模块

## 启动两种方式
* main 函数执行(运行PaginationPlugin 的main 函数,对应generatorConfig-B 文件) 
* 配置在pom 的maven plugin 执行(对应generatorConfig-A 文件),此处需要注意的是
自定义注释这块需要将MyCommentGenerator类文件打成jar,在build 中引入该jar,
否则执行会出现错误(不提倡第二种)