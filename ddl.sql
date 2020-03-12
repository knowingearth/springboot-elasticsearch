CREATE TABLE `t_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(60) DEFAULT NULL COMMENT '博客标题',
  `author` varchar(60) DEFAULT NULL COMMENT '博客作者',
  `content` mediumtext COMMENT '博客内容',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;


INSERT INTO `luckymoney`.`t_blog` (`id`, `title`, `author`, `content`, `create_time`, `update_time`) VALUES ('1', 'Spring框架', '上千年', 'Spring框架是由于软件开发的复杂性而创建的。Spring使用的是基本的JavaBean来完成以前只可能由EJB完成的事情。然而，Spring的用途不仅仅限于服务器端的开发。从简单性、可测试性和松耦合性角度而言，绝大部分Java应用都可以从Spring中受益。', '2020-03-11 12:27:54', '2020-03-11 12:27:54');
INSERT INTO `luckymoney`.`t_blog` (`id`, `title`, `author`, `content`, `create_time`, `update_time`) VALUES ('2', 'Spring MVC 总结', '旧的', 'Spring MVC是当前最优秀的MVC框架，自从Spring 2.5版本发布后，由于支持注解配置，易用性有了大幅度的提高。Spring 3.0更加完善，实现了对Struts 2的超越。现在越来越多的开发团队选择了Spring MVC。', '2020-03-11 12:27:54', '2020-03-11 12:27:54');
INSERT INTO `luckymoney`.`t_blog` (`id`, `title`, `author`, `content`, `create_time`, `update_time`) VALUES ('3', 'Spring Cloud', '睛', 'Spring Cloud是一系列框架的有序集合。它利用Spring Boot的开发便利性巧妙地简化了分布式系统基础设施的开发，如服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等，都可以用Spring Boot的开发风格做到一键启动和部署。Spring Cloud并没有重复制造轮子，它只是将各家公司开发的比较成熟、经得起实际考验的服务框架组合起来，通过Spring Boot风格进行再封装屏蔽掉了复杂的配置和实现原理，最终给开发者留出了一套简单易懂、易部署和易维护的分布式系统开发工具包。', '2020-03-11 12:27:54', '2020-03-11 12:27:54');
INSERT INTO `luckymoney`.`t_blog` (`id`, `title`, `author`, `content`, `create_time`, `update_time`) VALUES ('4', 'Spring Boot', '弩', 'Spring Boot是由Pivotal团队提供的全新框架，其设计目的是用来简化新Spring应用的初始搭建以及开发过程。该框架使用了特定的方式来进行配置，从而使开发人员不再需要定义样板化的配置。通过这种方式，Spring Boot致力于在蓬勃发展的快速应用开发领域(rapid application development)成为领导者。', '2020-03-11 12:27:54', '2020-03-11 12:27:54');
INSERT INTO `luckymoney`.`t_blog` (`id`, `title`, `author`, `content`, `create_time`, `update_time`) VALUES ('5', 'Spring IOC实现原理', '于', '由此我们可以看到，仅仅是为了修改轮胎的构造函数，这种设计却需要修改整个上层所有类的构造函数！在软件工程中，这样的设计几乎是不可维护的——在实际工程项目中，有的类可能会是几千个类的底层，如果每次修改这个类，我们都要修改所有以它作为依赖的类，那软件的维护成本就太高了。所以我们需要进行控制反转（IOC），及上层控制下层，而不是下层控制着上层。我们用依赖注入（Dependency Injection）这种方式来实现控制反转。所谓依赖注入，就是把底层类作为参数传入上层类，实现上层类对下层类的“控制”。这里我们用构造方法传递的依赖注入方式重新写车类的定义', '2020-03-11 12:27:54', '2020-03-11 12:27:54');
INSERT INTO `luckymoney`.`t_blog` (`id`, `title`, `author`, `content`, `create_time`, `update_time`) VALUES ('7', 'List', '特性', '履险如夷抗税冒雨', '2020-03-11 20:49:36', '2020-03-11 20:49:39');
INSERT INTO `luckymoney`.`t_blog` (`id`, `title`, `author`, `content`, `create_time`, `update_time`) VALUES ('6', 'Array', '枯', '冒雨二用', '2020-03-12 13:11:44', '2020-03-12 13:11:47');
INSERT INTO `luckymoney`.`t_blog` (`id`, `title`, `author`, `content`, `create_time`, `update_time`) VALUES ('8', '排序', '城', '蜱正月夺早于夺', '2020-03-12 13:12:28', '2020-03-12 13:12:32');
INSERT INTO `luckymoney`.`t_blog` (`id`, `title`, `author`, `content`, `create_time`, `update_time`) VALUES ('9', 'netty框架', '民', '冒十许昕', '2020-03-12 16:39:43', '2020-03-12 16:39:45');
