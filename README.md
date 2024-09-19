# [首页查询更多项目](https://github.com/GraduationProject-weixin) 包安装运行


# 50036wxapp在线课堂微信小程序

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1BPtKekEv3?p=40)


﻿# 摘  要
随着我国经济迅速发展，人们对手机的需求越来越大，各种手机软件也都在被广泛应用，但是对于手机进行数据信息管理，对于手机的各种软件也是备受用户的喜爱，在线课堂微信小程序被用户普遍使用，为方便用户能够可以随时进行在线课堂微信小程序的数据信息管理，特开发了基于在线课堂微信小程序的管理系统。

在线课堂微信小程序的设计主要是对系统所要实现的功能进行详细考虑，确定所要实现的功能后进行界面的设计，在这中间还要考虑如何可以更好的将功能及页面进行很好的结合，方便用户可以很容易明了的找到自己所需要的信息，还有系统平台后期的可操作性，通过对信息内容的详细了解进行技术的开发。

在线课堂微信小程序的开发利用现有的成熟技术参考，以源代码为模板，分析功能调整与在线课堂微信小程序的实际需求相结合，讨论了基于在线课堂微信小程序的使用。 

关键词：在线课堂微信小程序；JAVA
I
# ABSTRACT
With the rapid development of China's economy, people's demand for mobile phones is growing, all kinds of mobile phone software are widely used, but for mobile phone data information management, all kinds of mobile phone software is also loved by users, online classroom wechat applet is widely used by users, in order to facilitate users to carry out online classroom wechat applet data message at any time Information management, specially developed a management system based on online classroom wechat applet.

The design of online classroom wechat applet is mainly to consider the functions of the system in detail, and to design the interface after determining the functions to be realized. In the middle, we also need to consider how to better combine the functions and pages, so that users can easily find the information they need, and the operability of the system platform in the later stage, Through a detailed understanding of the content of information technology development.

The development of wechat applet in online classroom makes use of the existing mature technology reference, takes the source code as the template, analyzes the function adjustment and combines with the actual needs of wechat applet in online classroom, and discusses the use of wechat applet based on online classroom.  

Key words: online classroom, wechat applet, Java  

**目  录**

[摘  要	I](#_Toc10558)

[Abstract	II](#_Toc8367)

[第一章 绪 论	1](#_Toc19968)

[1.1选题背景	2](#_Toc23637)

[1.2研究现状	3](#_Toc15083)

[1.3研究内容	4](#_Toc23829)

[第二章 开发工具及关键技术介绍	6](#_Toc27845)

[2.1微信开发者工具	7](#_Toc2907)

[2.2小程序框架以及目录结构介绍	8](#_Toc2907)

[2.3 JAVA技术	8](#_Toc2907)

[2.4 Mysql数据库	8](#_Toc30233)

[2.5 SSM框架	8](#_Toc30233)

[第三章 系统分析	10](#_Toc19091)

[3.1需求分析	10](#_Toc13572)

[3.2可行性分析	10](#_Toc20007)

[3.2.1技术可行性：技术背景     	10](#_Toc12809)

[3.2.2经济可行性	11](#_Toc3693)

[3.2.3操作可行性： 	11](#_Toc24404)

[3.3性能分析	11](#_Toc32727)

[3.4系统操作流程	12](#_Toc21591)

[3.4.1管理员登录流程	12](#_Toc9649)

[3.4.2信息添加流程	12](#_Toc12871)

[3.4.3信息删除流程	13](#_Toc778)

[第四章 系统设计与实现	15](#_Toc990)

[4.1系统架构设计	15](#_Toc25591)

[4.2开发流程设计	15](#_Toc10269)

[4.3数据库设计	16](#_Toc18891)

[4.3.1实体ER图	16](#_Toc2065)

[4.3.2数据表	18](#_Toc23100)

[第五章 系统实现	21](#_Toc6133)

[5.1 用户前台功能实现	24](#_Toc10560)

[5.2 管理员后台功能实现	24](#_Toc10560)

[第六章  系统的测试	27](#_Toc20125)

[6.1 测试目的	27](#_Toc17339)

[6.2 测试方案设计	27](#_Toc24683)

[6.2.1 测试策略	27](#_Toc21292)

[6.2.2 测试分析	28](#_Toc10665)

[6.3 测试结果	28](#_Toc15975)

[结  论	29](#_Toc2621)

[参考文献	30](#_Toc20600)

[致  谢	31](#_Toc26818)


V
# 第一章 绪 论
## **1.1选题背景**
互联网是人类的基本需求，特别是在现代社会，个人压力增大，社会运作节奏高，随着互联网的快速发展，用户的需求也越来越高，用户也将越来越多依靠互联网而不是自己获取信息，使得各种软件程序的开发得到了应用。

近年来，随着我国经济的不断发展，平台的管理制度越来越多。每个在线课堂微信小程序也都将通过计算机进行整体智能化操作，对于在线课堂微信小程序功能所牵扯的数据都是通过用户进行在线课堂微信小程序等相关的数据信息内容可以通过系统进行分配，传统的管理方式信息已经无法满足用户的需求。为此开发了本在线课堂微信小程序 ，为用户提供一个基于在线课堂微信小程序，同时方便管理员后台；首页、个人中心、用户管理、课程分类管理、课程信息管理、课程订阅管理、课程视频管理、公告栏管理、留言板管理、系统管理，用户前台；首页、课程信息、公告栏、我的等详细功能进行操作。该系统满足了用户对在线课堂微信小程序信息获取的需求，并且信息可以及时、准确、有效地进行查看并且系统化、标准化和有效的工作。
## **1.2研究现状**
随着社会的发展和科学技术的进步，互联网技术越来越受欢迎。网络传播的生活方式逐渐受到广大人民群众的喜爱。越来越多的互联网爱好者开始在互联网上满足他们的基本需求，同时逐渐进入各个用户的生活起居。互联网具有许多优点，例如便利性，速度，高效率和低成本。因此，类似于在线课堂微信小程序，满足用户工作繁忙的需求，不仅是方便用户随时查看信息的途径，而且还能提高管理效率。

本文首先以在线课堂微信小程序过程的基本问题作为研究对象。在开发系统之前，我们对现有状况进行了详细的调查和分析。最后，我们利用计算机技术开发了一套完整合适的在线课堂微信小程序。该系统的实现主要优势是：该系统主要采用计算机技术开发，它方便快捷；系统可以通过管理员界面查看用户的所有信息管理。

在线课堂微信小程序系统软件是一款方便、快捷、实用的信息服务查询软件。随着智能网络在全球市场的不断普及以及各种智能平台的使用，系统的开发与人们的日常需求相关，作为中国主流智能的技术开发系统，自然需要这样的软件来满足更多用户的需求和体验。
## **1.3研究内容**
在线课堂微信小程序的开发及实现，所需要的工作内容：

（1）首先是确定选题，确定好所要做的系统，并对系统的背景及现在面临的一些问题等进行系统的初步确认。

（2）系统确认完成后，结合系统开发的需求进行确认系统开发所使用的技术，本在线课堂微信小程序的开发使用JAVA技术，数据库进行平台的搭建开发，确认好使用的技术进行技术分析，所使用的技术是否可以完成在线课堂微信小程序的实现。

（3）确定好系统使用的技术，进行在线确认系统所划分的用户角色，并且根据用户角色划分确定所要设计的功能模块，对于在线课堂微信小程序系统的设计主要划分别为管理员和用户角色，并所使用的功能模块也相应不同，但是系统的数据库实现的内容是交互的，用户可以随时根据自己的需求进行查询所需信息，对于系统工作人员可以根据自己的分管内容进行在线信息的处理及操作，管理员获取到所有用户的详细数据信息，并根据需求进行第一时间处理解决。

（4）系统的功能模块确认完成后进行程序及界面的设计，设计完成后，并且通过测试来判断程序是否完善，对于系统测试，需要不同的用户进行不同的内容编辑及提交，及使用不同的测试方式找出程序中存在的漏洞，并对程序出现的漏洞问题进行在线解决处理，如果测试系统没有任何问题时，可以将系统上传进行正式操作使用。


2. # 开发工具及关键技术介绍
## 2.1微信开发者工具
微信开发者工具现在已经被小程序开发团队开发运行，目前微信开发者工具任然在不断的完善中，在开发小程序时经常要不断的更新。可以使用微信扫码登陆开发者工具，开发者工具将使用这个微信帐号的信息进行小程序的开发和调试。

机型选择：小程序以智能手机的屏幕尺寸为设计标准，进行切图。

预览界面：写好视图布局后点击编译，用来刷新视图界面。

控制台：方便调试打印输出信息。

上传代码：上传到腾讯服务器，提交审核必经步骤。上传代码时可以填写版本号和备注信息。

资源文件：一般可以在资源文件进行对应项目的文件目录的断点调试。

显示远程调试：手机端和PC端开发工具联调对用户而言是非常实用的。

本地数据存储：显示的是本地存储的数据。

视图调试：标组件以子父层级结构呈现，方便调试。

微信限制在2M 以内的代码体积；开发中一般不校验合法域名信息；小程序后台要做配置服务器域名。

以上就是在开发过程中微信开发者工具常用到的功能，微信开发者工具也在不断的完善。
## 2.2小程序框架以及目录结构介绍
整个小程序框架系统分为两部分：[逻辑层](https://developers.weixin.qq.com/miniprogram/dev/framework/app-service/)和[视图层](https://developers.weixin.qq.com/miniprogram/dev/framework/view/)。小程序开发框架的目标是通过尽可能简单、高效的方式让开发者可以在微信中开发具有原生小程序体验的服务。小程序在视图层与逻辑层间提供了数据传输和事件系统，提供了自己的视图层以及逻辑层框架，让开发者能够专注于数据与逻辑。框架的核心是一个响应的数据绑定系统，可以让数据与视图非常简单地保持同步。在逻辑层做数据修改，在视图层就会做相应的更新。框架提供了一套基础的组件，这些组件自带微信风格的样式以及特殊的逻辑，开发者可以通过组合基础组件，创建出强大的微信小程序 。

## **2.3 JAVA技术**
Java主要采用CORBA技术和安全模型，可以在互联网应用的数据保护。它还提供了对EJB（Enterprise JavaBeans）的全面支持，java servlet API，java （java server pages），和XML技术。

JAVA语言功能：

面向对象：面向对象是Java编程语言的标志之一，是一种软件开发方法。最重要的是将所有东西变成对象，然后以某种方式编程。编程时，代码和数据写在每个对象上。 面向对象编程方法的出现使得人们在编程过程中的设计思考和操作变得非常简单，同时也提高了程序的安全性。

跨平台：Java流行的一个关键特性是它的跨平台特性，这使得用Java编程变得容易。您可以用Java编写程序并在其他地方运行它，而无需在编译后更改它。

垃圾回收机制：用来将那些在程序不操作时无用的对象所占用的内存空间释放掉，C ++最被人厌恶的就是因为其不能将在编程的过程中所占用的内存空间进行及时的释放，导致随着编程时间的变长所占用的内存空间越来越多。对于一些编程高手而言，他们会在刚开始编程的时候配置一块内存地址放在堆栈上，然后在不需要的时候会对其进行释放，而一些新手在很多的时候会忘记删除这个内存地址，从而导致程序在运行的过程中会变得十分的不稳定，最终有可能会导致程序崩溃。所以很多C ++的高手在编写程序时往往都会将删除后的指针的值设置为NULL，然后在删除之前确定一个指针的值是否为NULL。
## **2.4  Mysql数据库**
数据库是系统开发过程中不可或缺的一部分。 在WEB应用方面，MySQL AB开发了一个具有很大优势的MySQL关系数据库管理系统。 MySQL可以将数据存储在不同的表中，这非常灵活，并且还可以提高系统在实际应用中的速度。 数据库访问最常用于标准SQL语言，MySQL用于SQL语言，因此它具有高度兼容性。数据库的操作是必不可少的，包括对数据库表的增加、删除、修改、查询等功能。现如今，数据库可以分为关系型数据库和非关系型数据库，Mysql属于关系性数据库，Mysql数据库是一款小型的关系型数据库，它以其自身特点：体积小、速度快、成本低等，Mysql数据库是目前最受欢迎的开源数据库。

在WEB应用技术中， Mysql数据库支持不同的操作系统平台，虽然在不同平台下的安装和配置都不相同，但是差别也不是很大，Mysql在Windows平台下两种安装方式，二进制版和免安装版。安装完Mysql数据库之后，需要启动服务进程，相应的客户端就可以连接数据库，客户端可通过命令行或者图形界面工具登录数据库。

## 2.5 SSM框架
当今流行的“SSM组合框架”是Spring + SpringMVC + MyBatis的缩写，受到很多的追捧，“组合SSM框架”是强强联手、各司其职、协调互补的团队精神。web项目的框架，通常更简单的数据源。Spring属于一个轻量级的反转控制框架(IoC)，但它也是一个面向表面的容器(AOP)。SpringMVC常常用于控制器的分类工作模式，与模型对象分开，程序对象的作用与自动取款机进行处理。这种解耦治疗使整个系统的个性化变得更加容易。MyBatis是一个良好的可持续性框架，支持普通SQL查询，同时允许对存储过程的高级映射进行数据的优化处理。大型Java Web应用程序的由于开发成本太高，开发后难以维护和开发过程中一些难以解决的问题，而采用“SSM组合框架”，它允许建立业务层次结构，并为这个问题提供良好的解决方案。


24
# 第三章 系统分析
## **3.1需求分析**
任何一个项目在开发研究前，都需要对研发系统本身的需求做一个认真的分析，市场的调研是不可忽视的，从实际场景中确定使用人员的功能需求，从而明确目标，对整个系统的开发有一个更加准确的定位，在这个章节，需要对系统的性能分析，业务流程分析，和数据等进行分析，在线课堂微信小程序的整体界面简单，功能完善。

需求的可行性是分析和讨论发达的系统能达到什么样的要求。开发的系统平台是否符合之前的要求。只有在预先评估系统的开发中，才能在系统开发和实施之前完成需求。如果您不具备开发一个功能不合格的系统的可行性，那就是开发失败。开发系统是否有用，可以完成之前讨论过的需求，以下分析了在线课堂微信小程序的实际需求。

系统设计需要从用户和管理员的实际需求开始，以了解他们需要实施哪些功能以及他们可以包括哪些管理工作。

考虑到在线课堂微信小程序系统设计的特点，应满足几个要求：

（1）它可以通过网络开展在线课堂微信小程序信息管理工作，促进对在线课堂微信小程序信息管理。

（2）学习方法变得更加多样化，管理更加标准化;

（3）它提供了一个免费的渠道，以确保数据的实时有效沟通。
## **3.2可行性分析**
### 3.2.1技术可行性：技术背景     
在线课堂微信小程序采用了JAVA技术，开发了功能完备、使用简单的前端应用程序，并建立、维护了一个数据完整、安全、稳定性强的后台数据库系统。

系统使用JAVA技术和Mysql数据库作为设计工具，可简单易行地学习操作。用户角色之间的相结合开发一套在线课堂微信小程序是值得尝试的，数据完整性和许多品质为数据的功能分配和管理提供了依据。它也是数据库安全平台的重要组成部分，是提高和增强数据安全性的重要手段。此外，为了提供更平滑，更智能和更有效的基本控制方法，定义了同时构建对安全计算环境的支持所需的步骤，并帮助维护安全性。因为在这两种开发工具中，功能强大且免费且界面良好，所以在线课堂微信小程序在技术方面是可行的。
### 3.2.2经济可行性
桌面在线课堂微信小程序的开发是由开发者自己开发，不需要购买其他软件或者端口之类的，而且在在线课堂微信小程序的开发之前所做的市场调研及其他的在线课堂微信小程序，都是没有任何费用的，通过开发者自己的努力，所有的工作的都是自己亲力亲为，在碰到自己比较难以解决的问题，大多是通过同学和指导老师的帮助进行相关信息的解决，所以对于在线课堂微信小程序的开发在经济上是完全可行的，没有任何费用支出的。

使用JAVA技术是比较成熟的技术，所以在线课堂微信小程序的开发在经济上是没有问题的。
### 3.2.3操作可行性： 
可操作性主要是对在线课堂微信小程序系统设计完成后，用户的使用体验度，对于管理员可以通过系统随时管理相关的数据信息，并且对于管理员、用户二个权限角色，都可以简单明了的进入到自己的系统界面，通过界面导航菜单可以简单明了地操作功能模块，方便用户信息需求和在线课堂微信小程序数据信息，对于系统的操作，不需要专业人员都可以直接进行功能模块的操作管理，所以在系统的可操作性是完全可以的。本系统的操作使用的也是界面窗口进行登录，所以操作人员只要会简单的电脑操作就完全可以的。
## **3.3性能分析**
对于性能分析，与传统的管理方式相比，传统的管理方式是使用人工通过用纸和笔进行数据信息的统计和管理，并且这种方式对于存储和查找某一数据信息都比较麻烦，随着计算机网络的到来，这种传统的方法很难适应当下社会的发展，不仅降低人们的办事效率，而且还需要很多的人力和物力，对于使用的时间和所要花费的费用都是比较高的，为了降低成本费用，提高用户的工作效率，进行开发一套基于计算机和网络技术的在线课堂微信小程序。

在线课堂微信小程序的开发设计时一个独立的系统，以流行数据库进行数据的存储开发，主要是为了实现在线课堂微信小程序的用户角色及相对应的功能模块，让在线课堂微信小程序的管理不会存在管理差异、低效率，而是跟传统的管理信息恰好相反，在线课堂微信小程序的实现可以节约资源，并且对于业务的处理速度也提高，速度快、效率高，功能性强大。
## **3.4系统操作流程**
### 3.4.1用户登录流程
对于系统的安全性的第一关，就是用户想要进入系统，必须通过登录窗口，输入自己的登录信息才可以进行登录，用户输入的信息准确无误后才可以进入到操作系统界面，进行功能模块的相对应操作，如果用户输入的信息不正确，则窗口出现提示框，用户登录失败，返回到第一步进行重新输入，如图3-1所示。

![](/md/blog.001.png)图3-1登录操作流程图
### 3.4.2信息添加流程
对于在线课堂微信小程序，需要随时添加所需要的数据信息，对于用户添加信息，需要根据添加界面，根据选框的内容进行填写所要添加的数据信息，信息输入完成后判断数据信息是否符合要求，符合要求则添加完成，用户所添加的信息不符合要求，则需要返回到第一步，重新输入数据信息，再进行判断操作，如图3-2所示。

![](/md/blog.002.png)

图3-2 信息添加流程图
### 3.4.3信息删除流程
不管是哪个用户角色进入到不通的系统操作界面，都可以进行不同的信息内容的操作功能，对用系统数据信息的删除，用户一旦将信息删除，那么该删除的数据信息将无法恢复，所以用户在对数据删除事，一定判断删除的内容是否是确定要删除的，确定无误后选择确定删除操作，如图3-3所示。

![](/md/blog.003.png)

图3-3 信息删除流程图


# 第四章 系统设计与实现
## **4.1系统架构设计**
在线课堂微信小程序的系统项目的概述设计分析，主要内容有平台的具体分析，进行数据库的是设计，数据采用mysql数据库，并且对于系统的设计采用比较人性化的操作设计，对于系统出现的错误信息可以及时做出处理及反馈。

基于在线课堂微信小程序的设计基于现有的手机上可以运行，可以实现首页、个人中心、用户管理、课程分类管理、课程信息管理、课程订阅管理、课程视频管理、公告栏管理、留言板管理、系统管理等功能。方便用户对首页、课程信息、公告栏、我的等详细的了解及统计分析。根据系统功能需求建立的模块关系图如下图：

![](/md/blog.004.png)

图4-1管理员功能模块图

![](/md/blog.005.png)

图4-2用户功能模块图

## **4.2开发流程设计**
在线课堂微信小程序的开发对管理模块和系统使用的数据库进行分析，编写代开发，规划和操作是构建信息管理应用程序的必要三步曲，它决定了系统是否能够真正实现预设功能以及是否可以在成功设计后实施。在开发过程中，每个阶段必须严格按照线性顺序进行开发，并且在相应阶段生成的每个工作都可以通过技术进行验证和检查。确保一个阶段完成后是正确的，不会造成下一阶段拖拽现象，使系统完成设计功能后得到保证。

从在线课堂微信小程序的成功开发经验来看，上述方法效果最为明显，最大程度地降低了系统开发的复杂性。如图4-3所示。

![](/md/blog.006.png)

图4-3开发系统流程图
## **4.3数据库设计**
数据库是信息系统的基础和核心。数据库设计的好坏直接影响到信息系统开发的成败。创建数据库表首先确定实体的属性和实体之间的关系。根据关系创建一个数据表。
### 4.3.1实体ER图
数据库是整个软件编程中最重要的一个步骤，对于数据库问题主要是判定数据库的数量和结构公式的创建。展示系统使用的是Mysql进行对数据库进行管理，进行保证数据的安全性、稳定性等。

概念模型的设计是为了抽象真实世界的信息，并对信息世界进行建模。它是数据库设计的强大工具。数据库概念模型设计可以通过E-R图描述现实世界的概念模型。系统的E-R图显示了系统中实体之间的链接。而且Mysql数据库是自我保护能力比较强的数据库，下图主要是对数据库实体的E-R图：

(1)  用户信息E-R图，如图4-4所示：

![](/md/blog.007.png)

图4-4 用户信息实体属性图

` `(2)课程视频信息E-R图如图4-5所示：

![](/md/blog.008.png)

图4-5课程视频信息实体图

这些功能可以充分满足在线课堂微信小程序的需求。此系统功能较为全面如下图系统功能结构如图4-6所示。

`                                 `![](/md/blog.009.png)

图4-6系统功能结构图


### 4.3.2数据表
我们可以根据数据结构的详细分析要求，我们根据输入和输出数据量的要求进行分析，确定什么表表，结构之间的关系，我们可以验证，调整和完善，查询和浏览过程，可以实现数据库，以使用户对数据和功能有更多要求。

基于系统使用的数据库管理系统的特点，对数据库的概念模型进行了转换和构建。但是，这个系统只需要充分考虑在线课堂微信小程序的功能，而且组织比较清晰。

表名：gonggaolan

功能：公告栏表

|字段名称|类型|长度|字段说明|主键|默认值|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|bigint||主键|`
   `主键
||
|addtime|timestamp||创建时间||CURRENT\_TIMESTAMP|
|gonggaobiaoti|varchar|200|公告标题|||
|gonggaoleixing|varchar|200|公告类型|||
|fengmiantupian|varchar|200|封面图片|||
|neirong|varchar|200|内容|||
|faburiqi|varchar|200|发布日期|||
|faburen|varchar|200|发布人|||




表名：kechengdingyue

功能：课程订阅表

|字段名称|类型|长度|字段说明|主键|默认值|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|bigint||主键|`
   `主键
||
|addtime|timestamp||创建时间||CURRENT\_TIMESTAMP|
|dingyuebianhao|varchar|200|订阅编号|||
|kechengmingcheng|varchar|200|课程名称|||
|kechengfenlei|varchar|200|课程封面|||
|kechengtupian|varchar|200|课程图片|||
|renkelaoshi|varchar|200|任课老师|||
|kechengjiage|varchar|200|课程价格|||
|yonghuzhanghao|varchar|200|用户账号|||
|yonghuxingming|varchar|200|用户姓名|||
|yonghushouji|varchar|200|用户手机|||
|sfsh|varchar|200|是否审核|||
|shhf|varchar|200|审核回复|||





表名：kechengshipin

功能：课程视频表

|字段名称|类型|长度|字段说明|主键|默认值|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|bigint||主键|`
   `主键
||
|addtime|timestamp||创建时间||CURRENT\_TIMESTAMP|
|dingyuebianhao|varchar|200|订阅编号|||
|kechengmingcheng|varchar|200|课程名称|||
|kechengfenlei|varchar|200|课程分类|||
|kechengtupian|varchar|200|课程图片|||
|renkelaoshi|varchar|200|任课老师|||
|kechengshipin|varchar|200|课程视频|||
|fabushijian|varchar|200|发布时间|||
|yonghuzhanghao|varchar|200|用户账号|||
|yonghuxingming|varchar|200|用户姓名|||




表名：kechengxinxi

功能：课程信息表

|字段名称|类型|长度|字段说明|主键|默认值|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|bigint||主键|`
   `主键
||
|addtime|timestamp||创建时间||CURRENT\_TIMESTAMP|
|kechengmingcheng|varchar|200|课程名称|||
|kechengfenlei|varchar|200|课程封面|||
|kechengtupian|varchar|200|课程图片|||
|renkelaoshi|varchar|200|任课老师|||
|kechengjiage|varchar|200|课程价格|||
|yulanshipin|varchar|200|预览视频|||
|kechengjieshao|varchar|200|课程介绍|||
表名：yonghu

功能：用户表

|字段名称|类型|长度|字段说明|主键|默认值|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|bigint||主键|主键
||
|addtime|timestamp||创建时间||CURRENT\_TIMESTAMP|
|yonghuzhanghao|varchar|200|用户账号|||
|mima|varchar|200|密码|||
|yonghuxingming|varchar|200|用户姓名|||
|xingbie|varchar|200|性别|||
|nianling|varchar|200|年龄|||
|touxiang|varchar|200|头像|||
|yonghushouji|varchar|200|用户手机|||






# 第五章 系统实现
## **5.1用户前台功能实现**
注册用户通过注册窗口，进行在线填写用户账号、用户姓名、性别、年龄、头像、用户手机等，信息编辑完成后核对信息无误后进行选择注册，系统核对用户所输入的账号信息是否准确，核对信息准确无误后系统进入到操作界面。如图5-1所示。

![](/md/blog.010.png)

图5-1注册用户界面图

用户登录通过填写账号、密码进行登录，进入到在线课堂微信小程序主界面，如图5-2所示。

![](/md/blog.011.png)

图5-2用户登录界面图

用户首页页面可以查看首页、课程信息、公告栏、我的等信息，进行相对应的操作，如图5-3所示。

![](/md/blog.012.png)

图5-3首页功能界面图

用户进入课程信息页面可以查看课程名称、课程分类、课程图片、任课老师、课程价格、预览视频、课程介绍等信息，进行课程订阅、点我收藏操作，如图5-4所示。

![](/md/blog.013.png)

图5-4课程信息界面图

用户进入公告栏页面可以查看公告标题、公告类型、封面图片、发布日期、发布人、内容等信息，进行提交操作，如图5-5-所示。

![](/md/blog.014.png)

图5-5公告栏界面图

用户进入我的页面可以查看课程信息、课程订阅、课程视频、我的收藏管理、在线客服、留言板等信息，进行相对应的操作，如图5-6-所示。

![](/md/blog.015.png)

图5-6我的页面界面图

用户进入用户信息页面可以填写用户账号、密码、用户姓名、性别、年龄、头像、用户手机等信息，进行保存、退出登录操作，如图5-7-所示。

![](/md/blog.016.png)

图5-7用户信息界面图

用户进入课程订阅页面可以填写订阅编号、课程名称、课程分类、课程图片、任课老师、课程价格、用户账号、用户姓名、用户手机等信息，进行提交操作，如图5-8-所示。

![](/md/blog.017.png)

图5-8课程订阅界面图
## **5.2 管理员后台功能实现**
管理员通过在线课堂微信小程序进行确认，管理员进入到在线课堂微信小程序主界面，管理员进入到操作界面，通过登录窗口进行在线填写用户名和密码、角色进行登录，登录成功后进入到系统操作界面进行相应信息的获取，如图5-9所示。

![](/md/blog.018.png)

图5-9管理员登录界面图

管理员进入到界面，通过界面的任务大厅，登录成功后进入到系统可以进行查看首页、个人中心、用户管理、课程分类管理、课程信息管理、课程订阅管理、课程视频管理、公告栏管理、留言板管理、系统管理等功能模块，进行相对应操作，如图5-10所示。

![](/md/blog.019.png)

图5-10管理员功能界面图

管理员进入到用户管理页面可以查看用户账号、用户姓名、性别、年龄、头像、用户手机等信息，进行详情、修改、删除操作，如图5-11示。

![](/md/blog.020.png)

图5-11用户管理界面图

管理员进入到课程分类管理页面可以查看课程分类等信息，进行详情、修改、删除操作，如图5-12所示。

![](/md/blog.021.png)

图5-12课程分类管理界面图

管理员进入到课程信息管理界面可以查看课程名称、课程分类、课程图片、任课老师、课程价格、预览视频等信息，进行详情、修改、删除操作，如图5-13所示。

![](/md/blog.022.png)

图5-13课程信息管理界面图

管理员进入到课程订阅管理页面可以查看订阅编号、课程名称、课程分类、课程图片、任课老师、课程价格、用户账号、用户姓名、用户手机、是否支付、审核回复、审核状态、审核等信息，进行详情、推送视频、修改、删除操作，如图5-14所示。

![](/md/blog.023.png)

图5-14课程订阅管理界面图

管理员进入到课程视频管理页面可以查看订阅编号、课程名称、课程分类、课程图片、任课老师、课程视频、发布时间、用户账号、用户姓名等信息，进行详情、修改、删除操作，如图5-15所示。

![](/md/blog.024.png)

图5-15课程视频管理界面图

管理员进入公告栏管理页面可以查看公告标题、公告类型、封面图片、发布日期、发布人等信息，进行详情、修改、查看评论、删除操作，如图5-16所示。

![](/md/blog.025.png)

图5-16公告栏管理界面图

管理员进入留言板管理页面可以查看用户名、留言内容、回复内容等信息，进行详情、修改、回复、删除操作，如图5-17所示。

![](/md/blog.026.png)

图5-17留言板管理界面图

轮播图；该页面为轮播图管理界面。管理员可以在此页面进行首页轮播图的管理，通过新建操作可在轮播图中加入新的图片，还可以对以上传的图片进行修改操作，以及图片的删除操作，如图5-18所示。

![](/md/blog.027.png)图5-18轮播图界面图


# 第六章  系统的测试
## **6.1 测试目的**
程序设计不能保证没有错误，这是一个开发过程，在错误或错误的过程中难以避免，这是不可避免的，但我们不能使这些错误始终存在于系统中，错误可能会造成无法估量的后果 如系统崩溃，安全信息，系统无法正常启动，导致安装用户手机屏幕等，为了避免这些问题，我们需要测试程序，并发现这些问题，并纠正它们 ，并使系统更长时间稳定成熟，本章的作用是发现这些问题，并对其进行修改，虽然耗时费力，但长期非常重要和必要 系统的开发。

软件测试与开发过程是一样的，都必须按照软件工程的正规原理进行，遵守管理学理论。不过，目前国内的软件测试已经积累了大量经验和方法，步骤相对成熟，软件测试的效率也越来越高。

在线课堂微信小程序的实现，对于系统中功能模块的实现及操作都必须通过测试进行来评判系统是否可以准确的实现。在在线课堂微信小程序正式上传使用之前必须做的一步就是系统测试，对于测试发现的错误及时修改处理，保证系统准确无误的供给用户使用。
## **6.2 测试方案设计**
### 6.2.1 测试策略
1、功能测试

从用户的角度来看，测试时不了解新开发软件的内部结构，因此可以将系统与黑匣子进行比较，盲目输入后可以查看系统给出的反馈。这种测试属于黑盒测试，在测试中如果输入错误信息系统会报错。

2、性能测试

测试软件程序的整体状况（称为性能测试）通常使用自动化测试工具来检测系统的整体功能，在负载测试和压力测试之间进行分配，在某些情况下，将这两种情况结合起来。虽然压力测试可以检测到系统可以提供的最高级别的服务，但负载测试可以测试系统如何响应增加的负载。
### 6.2.2 测试分析
测试评估系统质量的方法不局限于系统编码和过程，应该与软件设计工作和历史需求分析密切相关。

软件测试应遵循以下原则：

(1)软件测试应尽快进行，整个测试部分应在软件开发和设计的整个过程中进行。如发现错误，立即处理，将大大减少软件开发的时间，并提高软件的质量。

(2)在软件的各种测试中，测试过程中使用的计划、报告等应妥善处理和存储。其主要目的是为了便于以后系统的维护。

(3)软件测试整个过程中的聚类现象应优先考虑。

(4)对于软件测试，我们应该尽量不去和自己设计的系统进行参考，而是要测试对方的程序，以确保软件测试结果的客观性和公平性。

(5)整个测试计划严格按照软件测试的具体实施细则进行。

(6)对整个测试结果进行综合检查，尽量避免重复错误。

本在线课堂微信小程序满足用户的要求和需求，本在线课堂微信小程序的使用能够有效的提高用户的使用率。
## **6.3 测试结果**
测试后得到的性能和用例，系统具有足够的正确性、可靠性、稳定性，并且可以对输入数据进行准确的点击操作处理和响应测试用户的体验也得到了很好的反馈和响应时间。合理的范围，可以兼容所有主流浏览器，设计所需的效果。
# 结  论
在这个设计中，我花了大量的时间去理解系统开发中使用的知识，经过这段时间的努力工作最终完成了系统设计。通过这一阶段的学习，我发现了自己的不足，充分掌握了必要的应用技能，进一步的学习使我充实了自己的知识基础，完成了这个艰巨的任务。当遇到问题时，我很及时的寻求老师的帮助，通过专业的网站和论坛来解决，他们的帮助让我一步一步的成功克服了困难的问题。系统设计过程不容易，你需要不断充实自己，有勇气克服困难。系统开发的一些功能还不完善，需要继续改善后，通过用户体验来修改设计完美的系统，让用户得到更好的体验，我觉得很高兴，因为这是我第一次通过自己的努力实现这个系统，但绝不是我的最后一个，在未来我将努力实现更多的优秀的系统。

在一些编程语言的系统实现中，对词汇表不太熟悉，导致了开发的困难，但是我通过了合适的字典软件来解决这个大问题。由此，我学会了自己的英语缺陷。在那之后，我不断地提高自己的英语知识，这样我就不会有任何未来的工作和生活。毕业设计过程我感觉很深刻，从一开始就不熟悉开发技术，一步一步的使用，接触到文献和信息，不难理解，系统是一次又一次的实现，系统本身对于在线学习是有用的。我从这个设计中获益良多，论文的编写需要有自己的意愿去实现一点，学习生活中所有的问题的勇气，学习的过程就是学习的过程。毕业设计，我学会了将理论知识应用于实践。让我知道该怎么做，我们必须认真对待。勇于克服困难，相信未来，我会做得更好。



参考文献

[1]耿祥义,张跃平.《java 实用教程》. 清华大学出版社,2019年5月

[2]Brown等.《java 编程指南（第二版）》. 电子工业出版社 ,2019年3月 

[3]BruceEckel.《Java编程思想》. 机械工业出版社,2019年10月

[4]孙一林,彭波.《Java数据库编程实例》. 清华大学出版社,2018年8月

[5]FLANAGAN.《Java技术手册》. 中国电力出版社,2017年6月

[6] David L.Anderson.Managing  Information Systems.清华大学出版社，2018：16

[7]孙卫琴,李洪成.《Tomcat 与 Java Web 开发技术详解》.电子工业出版社,2019年6月

[8]孙涌.《现代软件工程》.北京希望电子出版社,2019年8月

[9]（美）额尔曼.（美）威多姆.数据库系统基础教程.清华大学出版社，2019：5

[10]飞思科技产品研发中心.《java 应用开发详解》.电子工业出版社,2019年9月

[11] 张晓东. MySOL数据库应用系统与实例[M].北京:人民邮电出版社,2018：179

[12] 王家华．软件工程[M]，沈阳：东北大学出版社，2018：46.


# 致  谢
在线课堂微信小程序的完成，如何实现的更好，其中付出的努力是很大的，这段时光将会终身难忘。

在线课堂微信小程序的设计可以顺利完成，首先，我要感谢我的指导老师，他在我遇到设计问题时及时帮助了我，并在我对设计感到困惑时给了我充分的指导。在他的帮助下，我可以完成高质量的毕业设计。在在线课堂微信小程序的设计和开发中，指导老师提出了许多实用的意见和建议，并为我提供了大量相关的研究资料，使我对设计有了更深入的了解。只有在老师的指导下，才能在毕业设计中取得成功。在此，我要向指导老师表示深深的谢意。

在此，我还要感谢我的同学们，他们为我的设计提供了许多参考意见，并与我讨论了设计中的问题，从而使我的设计一步一步走向成熟。  












