# CRM-SpringBoot-Mvc-app
Error Logs for 404:

"C:\Program Files\Java\jdk-17\bin\java.exe" -Dmaven.multiModuleProjectDirectory=F:\Projects\CrmSpringMvc\crmApp "-Dmaven.home=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\plugins\maven\lib\maven3" "-Dclassworlds.conf=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\plugins\maven\lib\maven3\bin\m2.conf" "-Dmaven.ext.class.path=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\plugins\maven\lib\maven-event-listener.jar" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=55570:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\plugins\maven\lib\maven3\boot\plexus-classworlds-2.6.0.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\plugins\maven\lib\maven3\boot\plexus-classworlds.license" org.codehaus.classworlds.Launcher -Didea.version=2022.2.3 spring-boot:run
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< com.practice:crmApp >-------------------------
[INFO] Building crmAppSpringBoot 0.0.1-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:3.1.5:run (default-cli) > test-compile @ crmApp >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ crmApp ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.11.0:compile (default-compile) @ crmApp ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ crmApp ---
[INFO] skip non existing resourceDirectory F:\Projects\CrmSpringMvc\crmApp\src\test\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.11.0:testCompile (default-testCompile) @ crmApp ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] <<< spring-boot-maven-plugin:3.1.5:run (default-cli) < test-compile @ crmApp <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot-maven-plugin:3.1.5:run (default-cli) @ crmApp ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.5)

2023-11-16T23:13:44.099+05:30  INFO 328 --- [           main] c.p.crmApp.CrmAppSpringBootApplication   : Starting CrmAppSpringBootApplication using Java 17.0.6 with PID 328 (F:\Projects\CrmSpringMvc\crmApp\target\classes started by DELL in F:\Projects\CrmSpringMvc\crmApp)
2023-11-16T23:13:44.108+05:30 DEBUG 328 --- [           main] c.p.crmApp.CrmAppSpringBootApplication   : Running with Spring Boot v3.1.5, Spring v6.0.13
2023-11-16T23:13:44.110+05:30  INFO 328 --- [           main] c.p.crmApp.CrmAppSpringBootApplication   : No active profile set, falling back to 1 default profile: "default"
2023-11-16T23:13:44.114+05:30 DEBUG 328 --- [           main] o.s.boot.SpringApplication               : Loading source class com.practice.crmApp.CrmAppSpringBootApplication
2023-11-16T23:13:44.221+05:30 DEBUG 328 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@7a6d7e92
2023-11-16T23:13:44.271+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
2023-11-16T23:13:44.293+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory'
2023-11-16T23:13:44.413+05:30 DEBUG 328 --- [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [F:\Projects\CrmSpringMvc\crmApp\target\classes\com\practice\crmApp\controller\MainController.class]
2023-11-16T23:13:45.231+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'propertySourcesPlaceholderConfigurer'
2023-11-16T23:13:45.244+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor'
2023-11-16T23:13:45.252+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
2023-11-16T23:13:45.253+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'preserveErrorControllerTargetClassPostProcessor'
2023-11-16T23:13:45.254+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'forceAutoProxyCreatorToUseClassProxying'
2023-11-16T23:13:45.255+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
2023-11-16T23:13:45.266+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
2023-11-16T23:13:45.268+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
2023-11-16T23:13:45.272+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor'
2023-11-16T23:13:45.273+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.internalConfigurationPropertiesBinder'
2023-11-16T23:13:45.274+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.aop.config.internalAutoProxyCreator'
2023-11-16T23:13:45.291+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'webServerFactoryCustomizerBeanPostProcessor'
2023-11-16T23:13:45.291+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'errorPageRegistrarBeanPostProcessor'
2023-11-16T23:13:45.294+05:30 DEBUG 328 --- [           main] o.s.u.c.s.UiApplicationContextUtils      : Unable to locate ThemeSource with name 'themeSource': using default [org.springframework.ui.context.support.ResourceBundleThemeSource@6974a715]
2023-11-16T23:13:45.295+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'tomcatServletWebServerFactory'
2023-11-16T23:13:45.295+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat'
2023-11-16T23:13:45.346+05:30 DEBUG 328 --- [           main] o.a.catalina.core.AprLifecycleListener   : The Apache Tomcat Native library could not be found using names [tcnative-2, libtcnative-2, tcnative-1, libtcnative-1] on the java.library.path [C:\Program Files\Java\jdk-17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\dotnet\;C:\Program Files\Git\cmd;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.8.0_202;;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Local\Microsoft\WindowsApps;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\DELL\AppData\Roaming\npm;D:\apache-maven\apache-maven-3.8.6\bin;C:\Program Files\Java\jdk1.8.0_202;;.]. The errors reported were [Can't load library: F:\Projects\CrmSpringMvc\crmApp\bin\tcnative-2.dll, Can't load library: F:\Projects\CrmSpringMvc\crmApp\bin\libtcnative-2.dll, Can't load library: F:\Projects\CrmSpringMvc\crmApp\bin\tcnative-1.dll, Can't load library: F:\Projects\CrmSpringMvc\crmApp\bin\libtcnative-1.dll, no tcnative-2 in java.library.path: C:\Program Files\Java\jdk-17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\dotnet\;C:\Program Files\Git\cmd;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.8.0_202;;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Local\Microsoft\WindowsApps;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\DELL\AppData\Roaming\npm;D:\apache-maven\apache-maven-3.8.6\bin;C:\Program Files\Java\jdk1.8.0_202;;., no libtcnative-2 in java.library.path: C:\Program Files\Java\jdk-17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\dotnet\;C:\Program Files\Git\cmd;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.8.0_202;;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Local\Microsoft\WindowsApps;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\DELL\AppData\Roaming\npm;D:\apache-maven\apache-maven-3.8.6\bin;C:\Program Files\Java\jdk1.8.0_202;;., no tcnative-1 in java.library.path: C:\Program Files\Java\jdk-17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\dotnet\;C:\Program Files\Git\cmd;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.8.0_202;;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Local\Microsoft\WindowsApps;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\DELL\AppData\Roaming\npm;D:\apache-maven\apache-maven-3.8.6\bin;C:\Program Files\Java\jdk1.8.0_202;;., no libtcnative-1 in java.library.path: C:\Program Files\Java\jdk-17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\dotnet\;C:\Program Files\Git\cmd;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.8.0_202;;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Local\Microsoft\WindowsApps;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\DELL\AppData\Roaming\npm;D:\apache-maven\apache-maven-3.8.6\bin;C:\Program Files\Java\jdk1.8.0_202;;.]

org.apache.tomcat.jni.LibraryNotFoundError: Can't load library: F:\Projects\CrmSpringMvc\crmApp\bin\tcnative-2.dll, Can't load library: F:\Projects\CrmSpringMvc\crmApp\bin\libtcnative-2.dll, Can't load library: F:\Projects\CrmSpringMvc\crmApp\bin\tcnative-1.dll, Can't load library: F:\Projects\CrmSpringMvc\crmApp\bin\libtcnative-1.dll, no tcnative-2 in java.library.path: C:\Program Files\Java\jdk-17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\dotnet\;C:\Program Files\Git\cmd;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.8.0_202;;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Local\Microsoft\WindowsApps;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\DELL\AppData\Roaming\npm;D:\apache-maven\apache-maven-3.8.6\bin;C:\Program Files\Java\jdk1.8.0_202;;., no libtcnative-2 in java.library.path: C:\Program Files\Java\jdk-17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\dotnet\;C:\Program Files\Git\cmd;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.8.0_202;;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Local\Microsoft\WindowsApps;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\DELL\AppData\Roaming\npm;D:\apache-maven\apache-maven-3.8.6\bin;C:\Program Files\Java\jdk1.8.0_202;;., no tcnative-1 in java.library.path: C:\Program Files\Java\jdk-17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\dotnet\;C:\Program Files\Git\cmd;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.8.0_202;;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Local\Microsoft\WindowsApps;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\DELL\AppData\Roaming\npm;D:\apache-maven\apache-maven-3.8.6\bin;C:\Program Files\Java\jdk1.8.0_202;;., no libtcnative-1 in java.library.path: C:\Program Files\Java\jdk-17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\dotnet\;C:\Program Files\Git\cmd;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.8.0_202;;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Local\Microsoft\WindowsApps;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\DELL\AppData\Roaming\npm;D:\apache-maven\apache-maven-3.8.6\bin;C:\Program Files\Java\jdk1.8.0_202;;.
	at org.apache.tomcat.jni.Library.<init>(Library.java:91) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.jni.Library.initialize(Library.java:146) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.catalina.core.AprLifecycleListener.init(AprLifecycleListener.java:193) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.catalina.core.AprLifecycleListener.isAprAvailable(AprLifecycleListener.java:107) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getDefaultServerLifecycleListeners(TomcatServletWebServerFactory.java:182) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.<init>(TomcatServletWebServerFactory.java:129) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat.tomcatServletWebServerFactory(ServletWebServerFactoryConfiguration.java:73) ~[spring-boot-autoconfigure-3.1.5.jar:3.1.5]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:139) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:650) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:642) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1332) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1162) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:325) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:323) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:204) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.getWebServerFactory(ServletWebServerApplicationContext.java:218) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:181) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:161) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:610) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.5.jar:3.1.5]
	at com.practice.crmApp.CrmAppSpringBootApplication.main(CrmAppSpringBootApplication.java:10) ~[classes/:na]

2023-11-16T23:13:45.380+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'websocketServletWebServerCustomizer'
2023-11-16T23:13:45.380+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration'
2023-11-16T23:13:45.382+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletWebServerFactoryCustomizer'
2023-11-16T23:13:45.382+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration'
2023-11-16T23:13:45.395+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2023-11-16T23:13:45.405+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.properties.BoundConfigurationProperties'
2023-11-16T23:13:45.428+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'servletWebServerFactoryCustomizer' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2023-11-16T23:13:45.430+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'sslBundleRegistry'
2023-11-16T23:13:45.430+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration'
2023-11-16T23:13:45.432+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'sslPropertiesSslBundleRegistrar'
2023-11-16T23:13:45.432+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.ssl-org.springframework.boot.autoconfigure.ssl.SslProperties'
2023-11-16T23:13:45.433+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'sslPropertiesSslBundleRegistrar' via factory method to bean named 'spring.ssl-org.springframework.boot.autoconfigure.ssl.SslProperties'
2023-11-16T23:13:45.436+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'sslBundleRegistry' via factory method to bean named 'sslPropertiesSslBundleRegistrar'
2023-11-16T23:13:45.439+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'tomcatServletWebServerFactoryCustomizer'
2023-11-16T23:13:45.441+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'tomcatServletWebServerFactoryCustomizer' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2023-11-16T23:13:45.442+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'tomcatWebServerFactoryCustomizer'
2023-11-16T23:13:45.442+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$TomcatWebServerFactoryCustomizerConfiguration'
2023-11-16T23:13:45.443+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'tomcatWebServerFactoryCustomizer' via factory method to bean named 'environment'
2023-11-16T23:13:45.443+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'tomcatWebServerFactoryCustomizer' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2023-11-16T23:13:45.445+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'localeCharsetMappingsCustomizer'
2023-11-16T23:13:45.445+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration'
2023-11-16T23:13:45.448+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration' via constructor to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2023-11-16T23:13:45.505+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'errorPageCustomizer'
2023-11-16T23:13:45.505+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration'
2023-11-16T23:13:45.506+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration' via constructor to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2023-11-16T23:13:45.507+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dispatcherServletRegistration'
2023-11-16T23:13:45.507+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration'
2023-11-16T23:13:45.509+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dispatcherServlet'
2023-11-16T23:13:45.510+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration'
2023-11-16T23:13:45.514+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties'
2023-11-16T23:13:45.522+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'dispatcherServlet' via factory method to bean named 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties'
2023-11-16T23:13:45.549+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'dispatcherServletRegistration' via factory method to bean named 'dispatcherServlet'
2023-11-16T23:13:45.550+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'dispatcherServletRegistration' via factory method to bean named 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties'
2023-11-16T23:13:45.553+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'multipartConfigElement'
2023-11-16T23:13:45.553+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration'
2023-11-16T23:13:45.555+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties'
2023-11-16T23:13:45.561+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration' via constructor to bean named 'spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties'
2023-11-16T23:13:45.574+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'errorPageCustomizer' via factory method to bean named 'dispatcherServletRegistration'
2023-11-16T23:13:45.609+05:30 DEBUG 328 --- [           main] o.apache.tomcat.util.compat.Jre19Compat  : Class not found so assuming code is running on a pre-Java 19 JVM

java.lang.ClassNotFoundException: java.lang.WrongThreadException
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641) ~[na:na]
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188) ~[na:na]
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520) ~[na:na]
	at java.base/java.lang.Class.forName0(Native Method) ~[na:na]
	at java.base/java.lang.Class.forName(Class.java:375) ~[na:na]
	at org.apache.tomcat.util.compat.Jre19Compat.<clinit>(Jre19Compat.java:37) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.compat.JreCompat.<clinit>(JreCompat.java:55) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.catalina.startup.Tomcat.<clinit>(Tomcat.java:1279) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getWebServer(TomcatServletWebServerFactory.java:194) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:183) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:161) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:610) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.5.jar:3.1.5]
	at com.practice.crmApp.CrmAppSpringBootApplication.main(CrmAppSpringBootApplication.java:10) ~[classes/:na]

2023-11-16T23:13:45.609+05:30 DEBUG 328 --- [           main] o.apache.tomcat.util.compat.Jre21Compat  : Class not found so assuming code is running on a pre-Java 21 JVM

java.lang.ClassNotFoundException: java.lang.Thread$Builder
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641) ~[na:na]
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188) ~[na:na]
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520) ~[na:na]
	at java.base/java.lang.Class.forName0(Native Method) ~[na:na]
	at java.base/java.lang.Class.forName(Class.java:375) ~[na:na]
	at org.apache.tomcat.util.compat.Jre21Compat.<clinit>(Jre21Compat.java:43) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.compat.JreCompat.<clinit>(JreCompat.java:55) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.catalina.startup.Tomcat.<clinit>(Tomcat.java:1279) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getWebServer(TomcatServletWebServerFactory.java:194) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:183) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:161) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:610) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.5.jar:3.1.5]
	at com.practice.crmApp.CrmAppSpringBootApplication.main(CrmAppSpringBootApplication.java:10) ~[classes/:na]

2023-11-16T23:13:45.611+05:30 DEBUG 328 --- [           main] o.apache.tomcat.util.compat.Jre22Compat  : Class not found so assuming code is running on a pre-Java 22 JVM

java.lang.ClassNotFoundException: java.lang.foreign.MemorySegment
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641) ~[na:na]
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188) ~[na:na]
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520) ~[na:na]
	at java.base/java.lang.Class.forName0(Native Method) ~[na:na]
	at java.base/java.lang.Class.forName(Class.java:375) ~[na:na]
	at org.apache.tomcat.util.compat.Jre22Compat.<clinit>(Jre22Compat.java:40) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.compat.JreCompat.<clinit>(JreCompat.java:55) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.catalina.startup.Tomcat.<clinit>(Tomcat.java:1279) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getWebServer(TomcatServletWebServerFactory.java:194) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:183) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:161) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:610) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.5.jar:3.1.5]
	at com.practice.crmApp.CrmAppSpringBootApplication.main(CrmAppSpringBootApplication.java:10) ~[classes/:na]

2023-11-16T23:13:45.782+05:30 DEBUG 328 --- [           main] o.apache.tomcat.util.IntrospectionUtils  : IntrospectionUtils: setProperty(class org.apache.coyote.http11.Http11NioProtocol port=8080)
2023-11-16T23:13:45.794+05:30 DEBUG 328 --- [           main] o.apache.tomcat.util.IntrospectionUtils  : IntrospectionUtils: setProperty(class org.apache.coyote.http11.Http11NioProtocol bindOnInit=false)
2023-11-16T23:13:45.795+05:30 DEBUG 328 --- [           main] o.apache.tomcat.util.IntrospectionUtils  : IntrospectionUtils: setProperty(class org.apache.tomcat.util.net.NioEndpoint bindOnInit=false)
2023-11-16T23:13:45.823+05:30 DEBUG 328 --- [           main] org.apache.catalina.core.ContainerBase   : Add child StandardHost[localhost] StandardEngine[Tomcat]
2023-11-16T23:13:45.824+05:30 DEBUG 328 --- [           main] .s.b.w.e.t.TomcatServletWebServerFactory : Code archive: C:\Users\DELL\.m2\repository\org\springframework\boot\spring-boot\3.1.5\spring-boot-3.1.5.jar
2023-11-16T23:13:45.824+05:30 DEBUG 328 --- [           main] .s.b.w.e.t.TomcatServletWebServerFactory : Code archive: C:\Users\DELL\.m2\repository\org\springframework\boot\spring-boot\3.1.5\spring-boot-3.1.5.jar
2023-11-16T23:13:45.825+05:30 DEBUG 328 --- [           main] .s.b.w.e.t.TomcatServletWebServerFactory : Document root: F:\Projects\CrmSpringMvc\crmApp\src\main\webapp
2023-11-16T23:13:45.860+05:30 DEBUG 328 --- [           main] org.apache.catalina.core.ContainerBase   : Add child TomcatEmbeddedContext[/crm] StandardEngine[Tomcat].StandardHost[localhost]
2023-11-16T23:13:45.867+05:30  INFO 328 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-11-16T23:13:45.885+05:30  INFO 328 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-11-16T23:13:45.885+05:30  INFO 328 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.15]
2023-11-16T23:13:45.888+05:30 DEBUG 328 --- [           main] o.apache.catalina.core.StandardContext   : Starting crm
2023-11-16T23:13:45.922+05:30 DEBUG 328 --- [           main] o.apache.catalina.core.StandardContext   : Processing standard container startup
2023-11-16T23:13:45.922+05:30 DEBUG 328 --- [           main] o.apache.catalina.loader.WebappLoader    : Starting this Loader
2023-11-16T23:13:46.064+05:30 DEBUG 328 --- [           main] o.a.c.authenticator.AuthenticatorBase    : No SingleSignOn Valve is present
2023-11-16T23:13:46.065+05:30 DEBUG 328 --- [           main] o.apache.catalina.core.StandardContext   : No manager found. Checking if cluster manager should be used. Cluster configured: [false], Application distributable: [false]
2023-11-16T23:13:46.073+05:30 DEBUG 328 --- [           main] o.apache.catalina.core.StandardContext   : Configured a manager of class [org.apache.catalina.session.StandardManager]
2023-11-16T23:13:46.086+05:30  INFO 328 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/crm]    : Initializing Spring embedded WebApplicationContext
2023-11-16T23:13:46.087+05:30 DEBUG 328 --- [           main] w.s.c.ServletWebServerApplicationContext : Published root WebApplicationContext as ServletContext attribute with name [org.springframework.web.context.WebApplicationContext.ROOT]
2023-11-16T23:13:46.089+05:30  INFO 328 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1866 ms
2023-11-16T23:13:46.094+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'requestContextFilter'
2023-11-16T23:13:46.099+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'formContentFilter'
2023-11-16T23:13:46.099+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration'
2023-11-16T23:13:46.103+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'characterEncodingFilter'
2023-11-16T23:13:46.116+05:30 DEBUG 328 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters: characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105
2023-11-16T23:13:46.116+05:30 DEBUG 328 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets: dispatcherServlet urls=[/]
2023-11-16T23:13:46.120+05:30 DEBUG 328 --- [           main] org.apache.catalina.core.ContainerBase   : Add child StandardWrapper[dispatcherServlet] StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[/crm]
2023-11-16T23:13:46.148+05:30 DEBUG 328 --- [           main] o.apache.catalina.core.StandardContext   : Configuring application event listeners
2023-11-16T23:13:46.149+05:30 DEBUG 328 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/crm]    : Sending application start events
2023-11-16T23:13:46.153+05:30 DEBUG 328 --- [           main] o.a.catalina.session.StandardManager     : Start: Loading persisted sessions
2023-11-16T23:13:46.153+05:30 DEBUG 328 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/crm]    : Starting filters
2023-11-16T23:13:46.153+05:30 DEBUG 328 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/crm]    :  Starting filter 'requestContextFilter'
2023-11-16T23:13:46.158+05:30 DEBUG 328 --- [           main] o.s.b.w.s.f.OrderedRequestContextFilter  : Filter 'requestContextFilter' configured for use
2023-11-16T23:13:46.161+05:30 DEBUG 328 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/crm]    :  Starting filter 'Tomcat WebSocket (JSR356) Filter'
2023-11-16T23:13:46.161+05:30 DEBUG 328 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/crm]    :  Starting filter 'characterEncodingFilter'
2023-11-16T23:13:46.163+05:30 DEBUG 328 --- [           main] s.b.w.s.f.OrderedCharacterEncodingFilter : Filter 'characterEncodingFilter' configured for use
2023-11-16T23:13:46.163+05:30 DEBUG 328 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/crm]    :  Starting filter 'formContentFilter'
2023-11-16T23:13:46.163+05:30 DEBUG 328 --- [           main] o.s.b.w.s.f.OrderedFormContentFilter     : Filter 'formContentFilter' configured for use
2023-11-16T23:13:46.163+05:30 DEBUG 328 --- [           main] o.apache.catalina.core.StandardContext   : Starting completed
2023-11-16T23:13:46.166+05:30 DEBUG 328 --- [           main] org.apache.catalina.mapper.Mapper        : Registered host [localhost]
2023-11-16T23:13:46.167+05:30 DEBUG 328 --- [           main] o.apache.catalina.mapper.MapperListener  : Register Wrapper [dispatcherServlet] in Context [/crm] for service [StandardService[Tomcat]]
2023-11-16T23:13:46.168+05:30 DEBUG 328 --- [           main] o.apache.catalina.mapper.MapperListener  : Register Context [/crm] for service [StandardService[Tomcat]]
2023-11-16T23:13:46.168+05:30 DEBUG 328 --- [           main] o.apache.catalina.mapper.MapperListener  : Register host [localhost] at domain [null] for service [StandardService[Tomcat]]
2023-11-16T23:13:46.174+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'crmAppSpringBootApplication'
2023-11-16T23:13:46.176+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mainController'
2023-11-16T23:13:46.179+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.AutoConfigurationPackages'
2023-11-16T23:13:46.180+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration'
2023-11-16T23:13:46.181+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter'
2023-11-16T23:13:46.183+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration'
2023-11-16T23:13:46.183+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration'
2023-11-16T23:13:46.184+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration'
2023-11-16T23:13:46.184+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'taskExecutorBuilder'
2023-11-16T23:13:46.186+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties'
2023-11-16T23:13:46.188+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'taskExecutorBuilder' via factory method to bean named 'spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties'
2023-11-16T23:13:46.191+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration'
2023-11-16T23:13:46.192+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'error'
2023-11-16T23:13:46.193+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'beanNameViewResolver'
2023-11-16T23:13:46.194+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration'
2023-11-16T23:13:46.195+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.web-org.springframework.boot.autoconfigure.web.WebProperties'
2023-11-16T23:13:46.198+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration' via constructor to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@7a6d7e92'
2023-11-16T23:13:46.198+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration' via constructor to bean named 'spring.web-org.springframework.boot.autoconfigure.web.WebProperties'
2023-11-16T23:13:46.198+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'conventionErrorViewResolver'
2023-11-16T23:13:46.205+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'errorAttributes'
2023-11-16T23:13:46.207+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'basicErrorController'
2023-11-16T23:13:46.208+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'basicErrorController' via factory method to bean named 'errorAttributes'
2023-11-16T23:13:46.214+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration'
2023-11-16T23:13:46.216+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration' via constructor to bean named 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties'
2023-11-16T23:13:46.216+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration' via constructor to bean named 'spring.web-org.springframework.boot.autoconfigure.web.WebProperties'
2023-11-16T23:13:46.216+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration' via constructor to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@3cdf2c61'
2023-11-16T23:13:46.223+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter'
2023-11-16T23:13:46.224+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter' via constructor to bean named 'spring.web-org.springframework.boot.autoconfigure.web.WebProperties'
2023-11-16T23:13:46.224+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter' via constructor to bean named 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties'
2023-11-16T23:13:46.224+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter' via constructor to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@3cdf2c61'
2023-11-16T23:13:46.226+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'requestMappingHandlerAdapter'
2023-11-16T23:13:46.228+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcContentNegotiationManager'
2023-11-16T23:13:46.236+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcConversionService'
2023-11-16T23:13:46.240+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcValidator'
2023-11-16T23:13:46.241+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcContentNegotiationManager'
2023-11-16T23:13:46.242+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcConversionService'
2023-11-16T23:13:46.242+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcValidator'
2023-11-16T23:13:46.252+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'messageConverters'
2023-11-16T23:13:46.252+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration'
2023-11-16T23:13:46.257+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'stringHttpMessageConverter'
2023-11-16T23:13:46.257+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration'
2023-11-16T23:13:46.258+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'stringHttpMessageConverter' via factory method to bean named 'environment'
2023-11-16T23:13:46.264+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mappingJackson2HttpMessageConverter'
2023-11-16T23:13:46.264+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration'
2023-11-16T23:13:46.265+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jacksonObjectMapper'
2023-11-16T23:13:46.266+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration'
2023-11-16T23:13:46.266+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration'
2023-11-16T23:13:46.268+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'standardJacksonObjectMapperBuilderCustomizer'
2023-11-16T23:13:46.268+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration'
2023-11-16T23:13:46.268+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties'
2023-11-16T23:13:46.272+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'standardJacksonObjectMapperBuilderCustomizer' via factory method to bean named 'spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties'
2023-11-16T23:13:46.273+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'parameterNamesModule'
2023-11-16T23:13:46.273+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration'
2023-11-16T23:13:46.276+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jsonMixinModule'
2023-11-16T23:13:46.276+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonMixinConfiguration'
2023-11-16T23:13:46.277+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jsonMixinModuleEntries'
2023-11-16T23:13:46.277+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jsonMixinModuleEntries' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@7a6d7e92'
2023-11-16T23:13:46.277+05:30 DEBUG 328 --- [           main] o.s.b.a.AutoConfigurationPackages        : @EnableAutoConfiguration was declared on a class in the package 'com.practice.crmApp'. Automatic @Repository and @Entity scanning is enabled.
2023-11-16T23:13:46.282+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jsonMixinModule' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@7a6d7e92'
2023-11-16T23:13:46.282+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jsonMixinModule' via factory method to bean named 'jsonMixinModuleEntries'
2023-11-16T23:13:46.284+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jsonComponentModule'
2023-11-16T23:13:46.284+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration'
2023-11-16T23:13:46.293+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jacksonObjectMapperBuilder' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@7a6d7e92'
2023-11-16T23:13:46.293+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jacksonObjectMapperBuilder' via factory method to bean named 'standardJacksonObjectMapperBuilderCustomizer'
2023-11-16T23:13:46.299+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jacksonObjectMapper' via factory method to bean named 'jacksonObjectMapperBuilder'
2023-11-16T23:13:46.317+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mappingJackson2HttpMessageConverter' via factory method to bean named 'jacksonObjectMapper'
2023-11-16T23:13:46.330+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'applicationTaskExecutor'
2023-11-16T23:13:46.331+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'applicationTaskExecutor' via factory method to bean named 'taskExecutorBuilder'
2023-11-16T23:13:46.340+05:30 DEBUG 328 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2023-11-16T23:13:46.358+05:30 DEBUG 328 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2023-11-16T23:13:46.411+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'welcomePageHandlerMapping'
2023-11-16T23:13:46.413+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcResourceUrlProvider'
2023-11-16T23:13:46.414+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'welcomePageHandlerMapping' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@7a6d7e92'
2023-11-16T23:13:46.415+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'welcomePageHandlerMapping' via factory method to bean named 'mvcConversionService'
2023-11-16T23:13:46.415+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'welcomePageHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2023-11-16T23:13:46.430+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'welcomePageNotAcceptableHandlerMapping'
2023-11-16T23:13:46.430+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'welcomePageNotAcceptableHandlerMapping' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@7a6d7e92'
2023-11-16T23:13:46.431+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'welcomePageNotAcceptableHandlerMapping' via factory method to bean named 'mvcConversionService'
2023-11-16T23:13:46.431+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'welcomePageNotAcceptableHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2023-11-16T23:13:46.433+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'localeResolver'
2023-11-16T23:13:46.436+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'themeResolver'
2023-11-16T23:13:46.437+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'flashMapManager'
2023-11-16T23:13:46.440+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'requestMappingHandlerMapping'
2023-11-16T23:13:46.441+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcContentNegotiationManager'
2023-11-16T23:13:46.442+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcConversionService'
2023-11-16T23:13:46.442+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2023-11-16T23:13:46.483+05:30 DEBUG 328 --- [           main] _.s.web.servlet.HandlerMapping.Mappings  : 
	c.p.c.c.MainController:
	{GET [/AddCustomer]}: addCustomer()
	{GET [/home]}: getHome()
2023-11-16T23:13:46.488+05:30 DEBUG 328 --- [           main] _.s.web.servlet.HandlerMapping.Mappings  : 
	o.s.b.a.w.s.e.BasicErrorController:
	{ [/error]}: error(HttpServletRequest)
	{ [/error], produces [text/html]}: errorHtml(HttpServletRequest,HttpServletResponse)
2023-11-16T23:13:46.499+05:30 DEBUG 328 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 4 mappings in 'requestMappingHandlerMapping'
2023-11-16T23:13:46.500+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcPatternParser'
2023-11-16T23:13:46.501+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcUrlPathHelper'
2023-11-16T23:13:46.502+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcPathMatcher'
2023-11-16T23:13:46.503+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'viewControllerHandlerMapping'
2023-11-16T23:13:46.504+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcConversionService'
2023-11-16T23:13:46.504+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2023-11-16T23:13:46.504+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'beanNameHandlerMapping'
2023-11-16T23:13:46.505+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'beanNameHandlerMapping' via factory method to bean named 'mvcConversionService'
2023-11-16T23:13:46.505+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'beanNameHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2023-11-16T23:13:46.508+05:30 DEBUG 328 --- [           main] _.s.web.servlet.HandlerMapping.Mappings  : 'beanNameHandlerMapping' {}
2023-11-16T23:13:46.509+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'routerFunctionMapping'
2023-11-16T23:13:46.510+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'routerFunctionMapping' via factory method to bean named 'mvcConversionService'
2023-11-16T23:13:46.510+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'routerFunctionMapping' via factory method to bean named 'mvcResourceUrlProvider'
2023-11-16T23:13:46.517+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'resourceHandlerMapping'
2023-11-16T23:13:46.518+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcContentNegotiationManager'
2023-11-16T23:13:46.518+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcConversionService'
2023-11-16T23:13:46.518+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2023-11-16T23:13:46.537+05:30 DEBUG 328 --- [           main] _.s.web.servlet.HandlerMapping.Mappings  : 'resourceHandlerMapping' {/webjars/**=ResourceHttpRequestHandler [classpath [META-INF/resources/webjars/]], /**=ResourceHttpRequestHandler [classpath [META-INF/resources/], classpath [resources/], classpath [static/], classpath [public/], ServletContext [/]]}
2023-11-16T23:13:46.537+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'defaultServletHandlerMapping'
2023-11-16T23:13:46.538+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'handlerFunctionAdapter'
2023-11-16T23:13:46.539+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcUriComponentsContributor'
2023-11-16T23:13:46.540+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mvcUriComponentsContributor' via factory method to bean named 'mvcConversionService'
2023-11-16T23:13:46.540+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mvcUriComponentsContributor' via factory method to bean named 'requestMappingHandlerAdapter'
2023-11-16T23:13:46.545+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'httpRequestHandlerAdapter'
2023-11-16T23:13:46.546+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'simpleControllerHandlerAdapter'
2023-11-16T23:13:46.546+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'handlerExceptionResolver'
2023-11-16T23:13:46.548+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'handlerExceptionResolver' via factory method to bean named 'mvcContentNegotiationManager'
2023-11-16T23:13:46.551+05:30 DEBUG 328 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
2023-11-16T23:13:46.553+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcViewResolver'
2023-11-16T23:13:46.555+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mvcViewResolver' via factory method to bean named 'mvcContentNegotiationManager'
2023-11-16T23:13:46.558+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'viewNameTranslator'
2023-11-16T23:13:46.560+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'defaultViewResolver'
2023-11-16T23:13:46.568+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'viewResolver'
2023-11-16T23:13:46.569+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewResolver' via factory method to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@3cdf2c61'
2023-11-16T23:13:46.572+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'viewResolver'
2023-11-16T23:13:46.574+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration'
2023-11-16T23:13:46.574+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.aop.AopAutoConfiguration'
2023-11-16T23:13:46.575+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration'
2023-11-16T23:13:46.575+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'applicationAvailability'
2023-11-16T23:13:46.591+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration'
2023-11-16T23:13:46.591+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration'
2023-11-16T23:13:46.592+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'lifecycleProcessor'
2023-11-16T23:13:46.594+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties'
2023-11-16T23:13:46.597+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'lifecycleProcessor' via factory method to bean named 'spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties'
2023-11-16T23:13:46.599+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration'
2023-11-16T23:13:46.600+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration'
2023-11-16T23:13:46.604+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties'
2023-11-16T23:13:46.606+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration' via constructor to bean named 'spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties'
2023-11-16T23:13:46.606+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration'
2023-11-16T23:13:46.607+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties'
2023-11-16T23:13:46.609+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration'
2023-11-16T23:13:46.612+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'taskSchedulerBuilder'
2023-11-16T23:13:46.613+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties'
2023-11-16T23:13:46.614+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'taskSchedulerBuilder' via factory method to bean named 'spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties'
2023-11-16T23:13:46.615+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration'
2023-11-16T23:13:46.616+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration'
2023-11-16T23:13:46.616+05:30 DEBUG 328 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'multipartResolver'
2023-11-16T23:13:46.633+05:30 DEBUG 328 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase -2147483647
2023-11-16T23:13:46.634+05:30 DEBUG 328 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Successfully started bean 'springBootLoggingLifecycle'
2023-11-16T23:13:46.634+05:30 DEBUG 328 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147481599
2023-11-16T23:13:46.668+05:30 DEBUG 328 --- [o-8080-Acceptor] o.apache.tomcat.util.threads.LimitLatch  : Counting up[http-nio-8080-Acceptor] latch=0
2023-11-16T23:13:46.668+05:30  INFO 328 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path '/crm'
2023-11-16T23:13:46.670+05:30 DEBUG 328 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Successfully started bean 'webServerStartStop'
2023-11-16T23:13:46.670+05:30 DEBUG 328 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147482623
2023-11-16T23:13:46.670+05:30 DEBUG 328 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Successfully started bean 'webServerGracefulShutdown'
2023-11-16T23:13:46.685+05:30 DEBUG 328 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 


============================
CONDITIONS EVALUATION REPORT
============================


Positive matches:
-----------------

   AopAutoConfiguration matched:
      - @ConditionalOnProperty (spring.aop.auto=true) matched (OnPropertyCondition)

   AopAutoConfiguration.ClassProxyingConfiguration matched:
      - @ConditionalOnMissingClass did not find unwanted class 'org.aspectj.weaver.Advice' (OnClassCondition)
      - @ConditionalOnProperty (spring.aop.proxy-target-class=true) matched (OnPropertyCondition)

   ApplicationAvailabilityAutoConfiguration#applicationAvailability matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.availability.ApplicationAvailability; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DispatcherServletAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   DispatcherServletAutoConfiguration.DispatcherServletConfiguration matched:
      - @ConditionalOnClass found required class 'jakarta.servlet.ServletRegistration' (OnClassCondition)
      - Default DispatcherServlet did not find dispatcher servlet beans (DispatcherServletAutoConfiguration.DefaultDispatcherServletCondition)

   DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration matched:
      - @ConditionalOnClass found required class 'jakarta.servlet.ServletRegistration' (OnClassCondition)
      - DispatcherServlet Registration did not find servlet registration bean (DispatcherServletAutoConfiguration.DispatcherServletRegistrationCondition)

   DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration#dispatcherServletRegistration matched:
      - @ConditionalOnBean (names: dispatcherServlet types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet' (OnBeanCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration matched:
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnWarDeployment the application is not deployed as a WAR file. (OnWarDeploymentCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration matched:
      - @ConditionalOnClass found required classes 'org.apache.catalina.startup.Tomcat', 'org.apache.coyote.UpgradeProtocol' (OnClassCondition)

   ErrorMvcAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   ErrorMvcAutoConfiguration#basicErrorController matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.error.ErrorController; SearchStrategy: current) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration#errorAttributes matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.error.ErrorAttributes; SearchStrategy: current) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration#conventionErrorViewResolver matched:
      - @ConditionalOnBean (types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet'; @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration matched:
      - @ConditionalOnProperty (server.error.whitelabel.enabled) matched (OnPropertyCondition)
      - ErrorTemplate Missing did not find error template view (ErrorMvcAutoConfiguration.ErrorTemplateMissingCondition)

   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#beanNameViewResolver matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#defaultErrorView matched:
      - @ConditionalOnMissingBean (names: error; SearchStrategy: all) did not find any beans (OnBeanCondition)

   GenericCacheConfiguration matched:
      - Cache org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration automatic cache type (CacheCondition)

   HttpEncodingAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.filter.CharacterEncodingFilter' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnProperty (server.servlet.encoding.enabled) matched (OnPropertyCondition)

   HttpEncodingAutoConfiguration#characterEncodingFilter matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.filter.CharacterEncodingFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpMessageConvertersAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.HttpMessageConverter' (OnClassCondition)
      - NoneNestedConditions 0 matched 1 did not; NestedCondition on HttpMessageConvertersAutoConfiguration.NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes (HttpMessageConvertersAutoConfiguration.NotReactiveWebApplicationCondition)

   HttpMessageConvertersAutoConfiguration#messageConverters matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.http.HttpMessageConverters; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.StringHttpMessageConverter' (OnClassCondition)

   HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration#stringHttpMessageConverter matched:
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.StringHttpMessageConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonAutoConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper' (OnClassCondition)

   JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder' (OnClassCondition)

   JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder' (OnClassCondition)

   JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration#jacksonObjectMapperBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.json.Jackson2ObjectMapperBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonAutoConfiguration.JacksonObjectMapperConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder' (OnClassCondition)

   JacksonAutoConfiguration.JacksonObjectMapperConfiguration#jacksonObjectMapper matched:
      - @ConditionalOnMissingBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonAutoConfiguration.ParameterNamesModuleConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.module.paramnames.ParameterNamesModule' (OnClassCondition)

   JacksonAutoConfiguration.ParameterNamesModuleConfiguration#parameterNamesModule matched:
      - @ConditionalOnMissingBean (types: com.fasterxml.jackson.module.paramnames.ParameterNamesModule; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper' (OnClassCondition)
      - @ConditionalOnProperty (spring.mvc.converters.preferred-json-mapper=jackson) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) found bean 'jacksonObjectMapper' (OnBeanCondition)

   JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration#mappingJackson2HttpMessageConverter matched:
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.json.MappingJackson2HttpMessageConverter ignored: org.springframework.hateoas.server.mvc.TypeConstrainedMappingJackson2HttpMessageConverter,org.springframework.data.rest.webmvc.alps.AlpsJsonHttpMessageConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   LifecycleAutoConfiguration#defaultLifecycleProcessor matched:
      - @ConditionalOnMissingBean (names: lifecycleProcessor; SearchStrategy: current) did not find any beans (OnBeanCondition)

   MultipartAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.springframework.web.multipart.support.StandardServletMultipartResolver', 'jakarta.servlet.MultipartConfigElement' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnProperty (spring.servlet.multipart.enabled) matched (OnPropertyCondition)

   MultipartAutoConfiguration#multipartConfigElement matched:
      - @ConditionalOnMissingBean (types: jakarta.servlet.MultipartConfigElement; SearchStrategy: all) did not find any beans (OnBeanCondition)

   MultipartAutoConfiguration#multipartResolver matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   NoOpCacheConfiguration matched:
      - Cache org.springframework.boot.autoconfigure.cache.NoOpCacheConfiguration automatic cache type (CacheCondition)

   PropertyPlaceholderAutoConfiguration#propertySourcesPlaceholderConfigurer matched:
      - @ConditionalOnMissingBean (types: org.springframework.context.support.PropertySourcesPlaceholderConfigurer; SearchStrategy: current) did not find any beans (OnBeanCondition)

   RestTemplateAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.client.RestTemplate' (OnClassCondition)
      - NoneNestedConditions 0 matched 1 did not; NestedCondition on RestTemplateAutoConfiguration.NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes (RestTemplateAutoConfiguration.NotReactiveWebApplicationCondition)

   RestTemplateAutoConfiguration#restTemplateBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.client.RestTemplateBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   RestTemplateAutoConfiguration#restTemplateBuilderConfigurer matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.client.RestTemplateBuilderConfigurer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ServletWebServerFactoryAutoConfiguration matched:
      - @ConditionalOnClass found required class 'jakarta.servlet.ServletRequest' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   ServletWebServerFactoryAutoConfiguration#tomcatServletWebServerFactoryCustomizer matched:
      - @ConditionalOnClass found required class 'org.apache.catalina.startup.Tomcat' (OnClassCondition)

   ServletWebServerFactoryConfiguration.EmbeddedTomcat matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.apache.catalina.startup.Tomcat', 'org.apache.coyote.UpgradeProtocol' (OnClassCondition)
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.server.ServletWebServerFactory; SearchStrategy: current) did not find any beans (OnBeanCondition)

   SimpleCacheConfiguration matched:
      - Cache org.springframework.boot.autoconfigure.cache.SimpleCacheConfiguration automatic cache type (CacheCondition)

   SqlInitializationAutoConfiguration matched:
      - @ConditionalOnProperty (spring.sql.init.enabled) matched (OnPropertyCondition)
      - NoneNestedConditions 0 matched 1 did not; NestedCondition on SqlInitializationAutoConfiguration.SqlInitializationModeCondition.ModeIsNever @ConditionalOnProperty (spring.sql.init.mode=never) did not find property 'mode' (SqlInitializationAutoConfiguration.SqlInitializationModeCondition)

   SslAutoConfiguration#sslBundleRegistry matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.ssl.SslBundleRegistry,org.springframework.boot.ssl.SslBundles; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TaskExecutionAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor' (OnClassCondition)

   TaskExecutionAutoConfiguration#applicationTaskExecutor matched:
      - @ConditionalOnMissingBean (types: java.util.concurrent.Executor; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TaskExecutionAutoConfiguration#taskExecutorBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.task.TaskExecutorBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TaskSchedulingAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler' (OnClassCondition)

   TaskSchedulingAutoConfiguration#taskSchedulerBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.task.TaskSchedulerBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet', 'org.springframework.web.servlet.config.annotation.WebMvcConfigurer' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration#formContentFilter matched:
      - @ConditionalOnProperty (spring.mvc.formcontent.filter.enabled) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springframework.web.filter.FormContentFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.EnableWebMvcConfiguration#flashMapManager matched:
      - @ConditionalOnMissingBean (names: flashMapManager; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.EnableWebMvcConfiguration#localeResolver matched:
      - @ConditionalOnMissingBean (names: localeResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.EnableWebMvcConfiguration#themeResolver matched:
      - @ConditionalOnMissingBean (names: themeResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#defaultViewResolver matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.InternalResourceViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#requestContextFilter matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.context.request.RequestContextListener,org.springframework.web.filter.RequestContextFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#viewResolver matched:
      - @ConditionalOnBean (types: org.springframework.web.servlet.ViewResolver; SearchStrategy: all) found beans 'defaultViewResolver', 'beanNameViewResolver', 'mvcViewResolver'; @ConditionalOnMissingBean (names: viewResolver types: org.springframework.web.servlet.view.ContentNegotiatingViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebSocketServletAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'jakarta.websocket.server.ServerContainer' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration matched:
      - @ConditionalOnClass found required classes 'org.apache.catalina.startup.Tomcat', 'org.apache.tomcat.websocket.server.WsSci' (OnClassCondition)

   WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration#websocketServletWebServerCustomizer matched:
      - @ConditionalOnMissingBean (names: websocketServletWebServerCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)


Negative matches:
-----------------

   ActiveMQAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.jms.ConnectionFactory' (OnClassCondition)

   AopAutoConfiguration.AspectJAutoProxyingConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.aspectj.weaver.Advice' (OnClassCondition)

   ArtemisAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.jms.ConnectionFactory' (OnClassCondition)

   BatchAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.batch.core.launch.JobLauncher' (OnClassCondition)

   Cache2kCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.cache2k.Cache2kBuilder' (OnClassCondition)

   CacheAutoConfiguration:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.cache.interceptor.CacheAspectSupport; SearchStrategy: all) did not find any beans of type org.springframework.cache.interceptor.CacheAspectSupport (OnBeanCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.cache.CacheManager' (OnClassCondition)

   CacheAutoConfiguration.CacheManagerEntityManagerFactoryDependsOnPostProcessor:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean' (OnClassCondition)
         - Ancestor org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration did not match (ConditionEvaluationReport.AncestorsMatchedCondition)

   CaffeineCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.github.benmanes.caffeine.cache.Caffeine' (OnClassCondition)

   CassandraAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.cassandra.ReactiveSession' (OnClassCondition)

   CassandraRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   ClientHttpConnectorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   CodecsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   CouchbaseAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Bucket' (OnClassCondition)

   CouchbaseReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Bucket' (OnClassCondition)

   DataSourceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)

   DataSourceInitializationConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.jdbc.datasource.init.DatabasePopulator' (OnClassCondition)

   DataSourceTransactionManagerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.jdbc.core.JdbcTemplate' (OnClassCondition)

   DispatcherServletAutoConfiguration.DispatcherServletConfiguration#multipartResolver:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans of type org.springframework.web.multipart.MultipartResolver (OnBeanCondition)

   ElasticsearchClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'co.elastic.clients.elasticsearch.ElasticsearchClient' (OnClassCondition)

   ElasticsearchDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate' (OnClassCondition)

   ElasticsearchRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.repository.ElasticsearchRepository' (OnClassCondition)

   ElasticsearchRestClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.elasticsearch.client.RestClientBuilder' (OnClassCondition)

   EmbeddedLdapAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.unboundid.ldap.listener.InMemoryDirectoryServer' (OnClassCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.JettyWebServerFactoryCustomizerConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'org.eclipse.jetty.server.Server', 'org.eclipse.jetty.util.Loader', 'org.eclipse.jetty.webapp.WebAppContext' (OnClassCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.NettyWebServerFactoryCustomizerConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.netty.http.server.HttpServer' (OnClassCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.UndertowWebServerFactoryCustomizerConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'io.undertow.Undertow', 'org.xnio.SslClientAuthMode' (OnClassCondition)

   ErrorWebFluxAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer' (OnClassCondition)

   FlywayAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.flywaydb.core.Flyway' (OnClassCondition)

   FreeMarkerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'freemarker.template.Configuration' (OnClassCondition)

   GraphQlAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlQueryByExampleAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlQuerydslAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlRSocketAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlReactiveQueryByExampleAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlReactiveQuerydslAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlWebFluxAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlWebFluxSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlWebMvcAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlWebMvcSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GroovyTemplateAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'groovy.text.markup.MarkupTemplateEngine' (OnClassCondition)

   GsonAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.google.gson.Gson' (OnClassCondition)

   GsonHttpMessageConvertersConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.google.gson.Gson' (OnClassCondition)

   H2ConsoleAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.h2.server.web.JakartaWebServlet' (OnClassCondition)

   HazelcastAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HazelcastCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HazelcastJpaDependencyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HibernateJpaAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.persistence.EntityManager' (OnClassCondition)

   HttpHandlerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.DispatcherHandler' (OnClassCondition)

   HypermediaAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.hateoas.EntityModel' (OnClassCondition)

   InfinispanCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.infinispan.spring.embedded.provider.SpringEmbeddedCacheManager' (OnClassCondition)

   InfluxDbAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.influxdb.InfluxDB' (OnClassCondition)

   IntegrationAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.integration.config.EnableIntegration' (OnClassCondition)

   JCacheCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.cache.Caching' (OnClassCondition)

   JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.fasterxml.jackson.dataformat.xml.XmlMapper' (OnClassCondition)

   JdbcRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration' (OnClassCondition)

   JdbcTemplateAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.jdbc.core.JdbcTemplate' (OnClassCondition)

   JerseyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.glassfish.jersey.server.spring.SpringComponentProvider' (OnClassCondition)

   JmsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.jms.Message' (OnClassCondition)

   JmxAutoConfiguration:
      Did not match:
         - @ConditionalOnProperty (spring.jmx.enabled=true) did not find property 'enabled' (OnPropertyCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.jmx.export.MBeanExporter' (OnClassCondition)

   JndiConnectionFactoryAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.jms.core.JmsTemplate' (OnClassCondition)

   JndiDataSourceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)

   JooqAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.jooq.DSLContext' (OnClassCondition)

   JpaRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.jpa.repository.JpaRepository' (OnClassCondition)

   JsonbAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.json.bind.Jsonb' (OnClassCondition)

   JsonbHttpMessageConvertersConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.json.bind.Jsonb' (OnClassCondition)

   JtaAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.transaction.Transaction' (OnClassCondition)

   KafkaAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.kafka.core.KafkaTemplate' (OnClassCondition)

   LdapAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.ldap.core.ContextSource' (OnClassCondition)

   LdapRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.ldap.repository.LdapRepository' (OnClassCondition)

   LiquibaseAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'liquibase.change.DatabaseChange' (OnClassCondition)

   MailSenderAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.activation.MimeType' (OnClassCondition)

   MailSenderValidatorAutoConfiguration:
      Did not match:
         - @ConditionalOnSingleCandidate did not find required type 'org.springframework.mail.javamail.JavaMailSenderImpl' (OnBeanCondition)

   MessageSourceAutoConfiguration:
      Did not match:
         - ResourceBundle did not find bundle with basename messages (MessageSourceAutoConfiguration.ResourceBundleCondition)

   MongoAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient' (OnClassCondition)

   MongoDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient' (OnClassCondition)

   MongoReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient' (OnClassCondition)

   MongoReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient' (OnClassCondition)

   MongoReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient' (OnClassCondition)

   MongoRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient' (OnClassCondition)

   MustacheAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.samskivert.mustache.Mustache' (OnClassCondition)

   Neo4jAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   Neo4jDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   Neo4jReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   Neo4jReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   Neo4jRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   NettyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.netty.util.NettyRuntime' (OnClassCondition)

   OAuth2AuthorizationServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.server.authorization.OAuth2Authorization' (OnClassCondition)

   OAuth2AuthorizationServerJwtAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.server.authorization.OAuth2Authorization' (OnClassCondition)

   OAuth2ClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.configuration.EnableWebSecurity' (OnClassCondition)

   OAuth2ResourceServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.server.resource.authentication.BearerTokenAuthenticationToken' (OnClassCondition)

   PersistenceExceptionTranslationAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor' (OnClassCondition)

   ProjectInfoAutoConfiguration#buildProperties:
      Did not match:
         - @ConditionalOnResource did not find resource '${spring.info.build.location:classpath:META-INF/build-info.properties}' (OnResourceCondition)

   ProjectInfoAutoConfiguration#gitProperties:
      Did not match:
         - GitResource did not find git info at classpath:git.properties (ProjectInfoAutoConfiguration.GitResourceAvailableCondition)

   QuartzAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.quartz.Scheduler' (OnClassCondition)

   R2dbcAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory' (OnClassCondition)

   R2dbcDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.r2dbc.core.R2dbcEntityTemplate' (OnClassCondition)

   R2dbcInitializationConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'io.r2dbc.spi.ConnectionFactory', 'org.springframework.r2dbc.connection.init.DatabasePopulator' (OnClassCondition)

   R2dbcRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory' (OnClassCondition)

   R2dbcTransactionManagerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.r2dbc.connection.R2dbcTransactionManager' (OnClassCondition)

   RSocketGraphQlClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   RSocketMessagingAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.rsocket.RSocket' (OnClassCondition)

   RSocketRequesterAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.rsocket.RSocket' (OnClassCondition)

   RSocketSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.rsocket.core.SecuritySocketAcceptorInterceptor' (OnClassCondition)

   RSocketServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.rsocket.core.RSocketServer' (OnClassCondition)

   RSocketStrategiesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.netty.buffer.PooledByteBufAllocator' (OnClassCondition)

   RabbitAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.rabbitmq.client.Channel' (OnClassCondition)

   ReactiveElasticsearchClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'co.elastic.clients.transport.ElasticsearchTransport' (OnClassCondition)

   ReactiveElasticsearchRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.client.elc.ReactiveElasticsearchClient' (OnClassCondition)

   ReactiveMultipartAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer' (OnClassCondition)

   ReactiveOAuth2ClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ReactiveOAuth2ResourceServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity' (OnClassCondition)

   ReactiveSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ReactiveUserDetailsServiceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.authentication.ReactiveAuthenticationManager' (OnClassCondition)

   ReactiveWebServerFactoryAutoConfiguration:
      Did not match:
         - @ConditionalOnWebApplication did not find reactive web application classes (OnWebApplicationCondition)

   RedisAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.core.RedisOperations' (OnClassCondition)

   RedisCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.connection.RedisConnectionFactory' (OnClassCondition)

   RedisReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   RedisRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.repository.configuration.EnableRedisRepositories' (OnClassCondition)

   RepositoryRestMvcAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration' (OnClassCondition)

   Saml2RelyingPartyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.saml2.provider.service.registration.RelyingPartyRegistrationRepository' (OnClassCondition)

   SecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.authentication.DefaultAuthenticationEventPublisher' (OnClassCondition)

   SecurityFilterAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.http.SessionCreationPolicy' (OnClassCondition)

   SendGridAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.sendgrid.SendGrid' (OnClassCondition)

   ServletWebServerFactoryAutoConfiguration.ForwardedHeaderFilterConfiguration:
      Did not match:
         - @ConditionalOnProperty (server.forward-headers-strategy=framework) did not find property 'server.forward-headers-strategy' (OnPropertyCondition)

   ServletWebServerFactoryConfiguration.EmbeddedJetty:
      Did not match:
         - @ConditionalOnClass did not find required classes 'org.eclipse.jetty.server.Server', 'org.eclipse.jetty.util.Loader', 'org.eclipse.jetty.webapp.WebAppContext' (OnClassCondition)

   ServletWebServerFactoryConfiguration.EmbeddedUndertow:
      Did not match:
         - @ConditionalOnClass did not find required classes 'io.undertow.Undertow', 'org.xnio.SslClientAuthMode' (OnClassCondition)

   SessionAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.session.Session' (OnClassCondition)

   SpringApplicationAdminJmxAutoConfiguration:
      Did not match:
         - @ConditionalOnProperty (spring.application.admin.enabled=true) did not find property 'enabled' (OnPropertyCondition)

   SpringDataWebAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.web.PageableHandlerMethodArgumentResolver' (OnClassCondition)

   TaskSchedulingAutoConfiguration#scheduledBeanLazyInitializationExcludeFilter:
      Did not match:
         - @ConditionalOnBean (names: org.springframework.context.annotation.internalScheduledAnnotationProcessor; SearchStrategy: all) did not find any beans named org.springframework.context.annotation.internalScheduledAnnotationProcessor (OnBeanCondition)

   TaskSchedulingAutoConfiguration#taskScheduler:
      Did not match:
         - @ConditionalOnBean (names: org.springframework.context.annotation.internalScheduledAnnotationProcessor; SearchStrategy: all) did not find any beans named org.springframework.context.annotation.internalScheduledAnnotationProcessor (OnBeanCondition)

   ThymeleafAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.thymeleaf.spring6.SpringTemplateEngine' (OnClassCondition)

   TransactionAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.transaction.PlatformTransactionManager' (OnClassCondition)

   UserDetailsServiceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.authentication.AuthenticationManager' (OnClassCondition)

   ValidationAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.validation.executable.ExecutableValidator' (OnClassCondition)

   WebClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   WebFluxAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer' (OnClassCondition)

   WebMvcAutoConfiguration#hiddenHttpMethodFilter:
      Did not match:
         - @ConditionalOnProperty (spring.mvc.hiddenmethod.filter.enabled) did not find property 'enabled' (OnPropertyCondition)

   WebMvcAutoConfiguration.ProblemDetailsErrorHandlingConfiguration:
      Did not match:
         - @ConditionalOnProperty (spring.mvc.problemdetails.enabled=true) did not find property 'enabled' (OnPropertyCondition)

   WebMvcAutoConfiguration.ResourceChainCustomizerConfiguration:
      Did not match:
         - @ConditionalOnEnabledResourceChain did not find class org.webjars.WebJarAssetLocator (OnEnabledResourceChainCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#beanNameViewResolver:
      Did not match:
         - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) found beans of type 'org.springframework.web.servlet.view.BeanNameViewResolver' beanNameViewResolver (OnBeanCondition)

   WebServiceTemplateAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.oxm.Marshaller' (OnClassCondition)

   WebServicesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.ws.transport.http.MessageDispatcherServlet' (OnClassCondition)

   WebSessionIdResolverAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Mono' (OnClassCondition)

   WebSocketMessagingAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer' (OnClassCondition)

   WebSocketReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnWebApplication did not find reactive web application classes (OnWebApplicationCondition)

   WebSocketServletAutoConfiguration.JettyWebSocketConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.eclipse.jetty.websocket.jakarta.server.config.JakartaWebSocketServletContainerInitializer' (OnClassCondition)

   WebSocketServletAutoConfiguration.UndertowWebSocketConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.undertow.websockets.jsr.Bootstrap' (OnClassCondition)

   XADataSourceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.transaction.TransactionManager' (OnClassCondition)


Exclusions:
-----------

    None


Unconditional classes:
----------------------

    org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration

    org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration

    org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration

    org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration

    org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration

    org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration



2023-11-16T23:13:46.694+05:30  INFO 328 --- [           main] c.p.crmApp.CrmAppSpringBootApplication   : Started CrmAppSpringBootApplication in 3.329 seconds (process running for 3.982)
2023-11-16T23:13:46.697+05:30 DEBUG 328 --- [           main] o.s.b.a.ApplicationAvailabilityBean      : Application availability state LivenessState changed to CORRECT
2023-11-16T23:13:46.699+05:30 DEBUG 328 --- [           main] o.s.b.a.ApplicationAvailabilityBean      : Application availability state ReadinessState changed to ACCEPTING_TRAFFIC
2023-11-16T23:14:46.215+05:30 DEBUG 328 --- [alina-utility-1] o.apache.catalina.session.ManagerBase    : Start expire sessions StandardManager at 1700156686211 sessioncount 0
2023-11-16T23:14:46.216+05:30 DEBUG 328 --- [alina-utility-1] o.apache.catalina.session.ManagerBase    : End expire sessions StandardManager processingTime 5 expired sessions: 0
2023-11-16T23:15:46.292+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : Start expire sessions StandardManager at 1700156746282 sessioncount 0
2023-11-16T23:15:46.299+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : End expire sessions StandardManager processingTime 17 expired sessions: 0
2023-11-16T23:16:46.345+05:30 DEBUG 328 --- [alina-utility-1] o.apache.catalina.session.ManagerBase    : Start expire sessions StandardManager at 1700156806345 sessioncount 0
2023-11-16T23:16:46.346+05:30 DEBUG 328 --- [alina-utility-1] o.apache.catalina.session.ManagerBase    : End expire sessions StandardManager processingTime 1 expired sessions: 0
2023-11-16T23:16:53.785+05:30 DEBUG 328 --- [o-8080-Acceptor] o.apache.tomcat.util.threads.LimitLatch  : Counting up[http-nio-8080-Acceptor] latch=1
2023-11-16T23:16:53.786+05:30 DEBUG 328 --- [o-8080-Acceptor] o.apache.tomcat.util.threads.LimitLatch  : Counting up[http-nio-8080-Acceptor] latch=2
2023-11-16T23:16:53.912+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.coyote.http11.Http11InputBuffer      : Before fill(): parsingHeader: [true], parsingRequestLine: [true], parsingRequestLinePhase: [0], parsingRequestLineStart: [0], byteBuffer.position(): [0], byteBuffer.limit(): [0], end: [0]
2023-11-16T23:16:53.914+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.tomcat.util.net.SocketWrapperBase    : Socket: [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@16f0bfc1:org.apache.tomcat.util.net.NioChannel@12444208:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55881]], Read from buffer: [0]
2023-11-16T23:16:53.915+05:30 DEBUG 328 --- [nio-8080-exec-1] org.apache.tomcat.util.net.NioEndpoint   : Socket: [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@16f0bfc1:org.apache.tomcat.util.net.NioChannel@12444208:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55881]], Read direct from socket: [811]
2023-11-16T23:16:53.916+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.coyote.http11.Http11InputBuffer      : Received [GET /crm/home HTTP/1.1
Host: localhost:8080
Connection: keep-alive
Cache-Control: max-age=0
sec-ch-ua: "Google Chrome";v="119", "Chromium";v="119", "Not?A_Brand";v="24"
sec-ch-ua-mobile: ?0
sec-ch-ua-platform: "Windows"
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
Sec-Fetch-Site: none
Sec-Fetch-Mode: navigate
Sec-Fetch-User: ?1
Sec-Fetch-Dest: document
Accept-Encoding: gzip, deflate, br
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8,hi;q=0.7
Cookie: JSESSIONID=DDA33AA2C1E78746EA1CA2BE33954DCC; JSESSIONID=CD069C1F3AE63B9AC8762525B8B8D99A

]
2023-11-16T23:16:53.951+05:30 DEBUG 328 --- [nio-8080-exec-1] org.apache.tomcat.util.http.Parameters   : Set query string encoding to UTF-8
2023-11-16T23:16:53.953+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.t.util.http.Rfc6265CookieProcessor   : Cookies: Parsing b[]: JSESSIONID=DDA33AA2C1E78746EA1CA2BE33954DCC; JSESSIONID=CD069C1F3AE63B9AC8762525B8B8D99A
2023-11-16T23:16:53.955+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.catalina.connector.CoyoteAdapter     :  Requested cookie session id is DDA33AA2C1E78746EA1CA2BE33954DCC
2023-11-16T23:16:53.957+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.authenticator.AuthenticatorBase    : Security checking request GET /crm/home
2023-11-16T23:16:53.957+05:30 DEBUG 328 --- [nio-8080-exec-1] org.apache.catalina.realm.RealmBase      :   No applicable constraints defined
2023-11-16T23:16:53.964+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.a.jaspic.AuthConfigFactoryImpl     : Loading persistent provider registrations from [C:\Users\DELL\AppData\Local\Temp\tomcat.8080.771699773248443411\conf\jaspic-providers.xml]
2023-11-16T23:16:53.965+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.authenticator.AuthenticatorBase    : Not subject to any constraint
2023-11-16T23:16:53.969+05:30  INFO 328 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/crm]    : Initializing Spring DispatcherServlet 'dispatcherServlet'
2023-11-16T23:16:53.969+05:30  INFO 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2023-11-16T23:16:53.969+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected StandardServletMultipartResolver
2023-11-16T23:16:53.969+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected AcceptHeaderLocaleResolver
2023-11-16T23:16:53.969+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected FixedThemeResolver
2023-11-16T23:16:53.971+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@6aebb8a6
2023-11-16T23:16:53.972+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected org.springframework.web.servlet.support.SessionFlashMapManager@48274f4e
2023-11-16T23:16:53.972+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logging of potentially sensitive data
2023-11-16T23:16:53.972+05:30  INFO 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 3 ms
2023-11-16T23:16:53.989+05:30 DEBUG 328 --- [nio-8080-exec-1] org.apache.tomcat.util.http.Parameters   : Set encoding to UTF-8
2023-11-16T23:16:53.989+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : GET "/crm/home", parameters={}
2023-11-16T23:16:54.016+05:30 DEBUG 328 --- [nio-8080-exec-1] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.practice.crmApp.controller.MainController#getHome()
2023-11-16T23:16:54.029+05:30  INFO 328 --- [nio-8080-exec-1] c.p.crmApp.controller.MainController     : MainController->Getting /home
2023-11-16T23:16:54.038+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.w.s.v.ContentNegotiatingViewResolver : Selected 'text/html' given [text/html, application/xhtml+xml, image/avif, image/webp, image/apng, application/xml;q=0.9, */*;q=0.8, application/signed-exchange;v=b3;q=0.7]
2023-11-16T23:16:54.039+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.w.servlet.view.InternalResourceView  : View name 'home', model {msg=Customer Table}
2023-11-16T23:16:54.041+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.w.servlet.view.InternalResourceView  : Forwarding to [/WEB-INF/jsp/home.jsp]
2023-11-16T23:16:54.049+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : "FORWARD" dispatch for GET "/crm/WEB-INF/jsp/home.jsp", parameters={}
2023-11-16T23:16:54.052+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped to ResourceHttpRequestHandler [classpath [META-INF/resources/], classpath [resources/], classpath [static/], classpath [public/], ServletContext [/]]
2023-11-16T23:16:54.054+05:30  WARN 328 --- [nio-8080-exec-1] o.s.w.s.r.ResourceHttpRequestHandler     : "Path with "WEB-INF" or "META-INF": [WEB-INF/jsp/home.jsp]"
2023-11-16T23:16:54.054+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.w.s.r.ResourceHttpRequestHandler     : Resource not found
2023-11-16T23:16:54.056+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Exiting from "FORWARD" dispatch, status 404
2023-11-16T23:16:54.057+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.c.C.[.[.[.[dispatcherServlet]      :  Disabling the response for further output
2023-11-16T23:16:54.058+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed 404 NOT_FOUND
2023-11-16T23:16:54.058+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost]           : Processing ErrorPage[errorCode=0, location=/error]
2023-11-16T23:16:54.059+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : "ERROR" dispatch for GET "/crm/error", parameters={}
2023-11-16T23:16:54.061+05:30 DEBUG 328 --- [nio-8080-exec-1] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#errorHtml(HttpServletRequest, HttpServletResponse)
2023-11-16T23:16:54.069+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(freemarker.template.Configuration)
2023-11-16T23:16:54.070+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.070+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(freemarker.template$Configuration)
2023-11-16T23:16:54.070+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.071+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(com.samskivert.mustache.Template)
2023-11-16T23:16:54.071+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.071+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(com.samskivert.mustache$Template)
2023-11-16T23:16:54.072+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.072+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(groovy.text.TemplateEngine)
2023-11-16T23:16:54.073+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.073+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(groovy.text$TemplateEngine)
2023-11-16T23:16:54.074+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.074+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(org.thymeleaf.spring6.SpringTemplateEngine)
2023-11-16T23:16:54.075+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.075+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(org.thymeleaf.spring6$SpringTemplateEngine)
2023-11-16T23:16:54.076+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.077+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(org.apache.jasper.compiler.JspConfig)
2023-11-16T23:16:54.077+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.079+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(org.apache.jasper.compiler$JspConfig)
2023-11-16T23:16:54.080+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.081+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       : getResource(META-INF/resources/error/404.html)
2023-11-16T23:16:54.082+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   Delegating to parent classloader jdk.internal.loader.ClassLoaders$AppClassLoader@73d16e93
2023-11-16T23:16:54.082+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   --> Resource not found, returning null
2023-11-16T23:16:54.083+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       : getResource(resources/error/404.html)
2023-11-16T23:16:54.083+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   Delegating to parent classloader jdk.internal.loader.ClassLoaders$AppClassLoader@73d16e93
2023-11-16T23:16:54.083+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   --> Resource not found, returning null
2023-11-16T23:16:54.083+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       : getResource(static/error/404.html)
2023-11-16T23:16:54.083+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   Delegating to parent classloader jdk.internal.loader.ClassLoaders$AppClassLoader@73d16e93
2023-11-16T23:16:54.084+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   --> Resource not found, returning null
2023-11-16T23:16:54.085+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       : getResource(public/error/404.html)
2023-11-16T23:16:54.085+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   Delegating to parent classloader jdk.internal.loader.ClassLoaders$AppClassLoader@73d16e93
2023-11-16T23:16:54.085+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   --> Resource not found, returning null
2023-11-16T23:16:54.085+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(freemarker.template.Configuration)
2023-11-16T23:16:54.086+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.086+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(freemarker.template$Configuration)
2023-11-16T23:16:54.087+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.087+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(com.samskivert.mustache.Template)
2023-11-16T23:16:54.088+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.088+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(com.samskivert.mustache$Template)
2023-11-16T23:16:54.089+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.089+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(groovy.text.TemplateEngine)
2023-11-16T23:16:54.089+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.090+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(groovy.text$TemplateEngine)
2023-11-16T23:16:54.090+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.090+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(org.thymeleaf.spring6.SpringTemplateEngine)
2023-11-16T23:16:54.091+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.091+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(org.thymeleaf.spring6$SpringTemplateEngine)
2023-11-16T23:16:54.092+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.092+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(org.apache.jasper.compiler.JspConfig)
2023-11-16T23:16:54.093+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.094+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     findClass(org.apache.jasper.compiler$JspConfig)
2023-11-16T23:16:54.094+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :     --> Returning ClassNotFoundException
2023-11-16T23:16:54.094+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       : getResource(META-INF/resources/error/4xx.html)
2023-11-16T23:16:54.095+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   Delegating to parent classloader jdk.internal.loader.ClassLoaders$AppClassLoader@73d16e93
2023-11-16T23:16:54.095+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   --> Resource not found, returning null
2023-11-16T23:16:54.095+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       : getResource(resources/error/4xx.html)
2023-11-16T23:16:54.096+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   Delegating to parent classloader jdk.internal.loader.ClassLoaders$AppClassLoader@73d16e93
2023-11-16T23:16:54.096+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   --> Resource not found, returning null
2023-11-16T23:16:54.096+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       : getResource(static/error/4xx.html)
2023-11-16T23:16:54.096+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   Delegating to parent classloader jdk.internal.loader.ClassLoaders$AppClassLoader@73d16e93
2023-11-16T23:16:54.097+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   --> Resource not found, returning null
2023-11-16T23:16:54.098+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       : getResource(public/error/4xx.html)
2023-11-16T23:16:54.099+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   Delegating to parent classloader jdk.internal.loader.ClassLoaders$AppClassLoader@73d16e93
2023-11-16T23:16:54.100+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.loader.WebappClassLoaderBase       :   --> Resource not found, returning null
2023-11-16T23:16:54.101+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.w.s.v.ContentNegotiatingViewResolver : Selected 'text/html' given [text/html, text/html;q=0.8]
2023-11-16T23:16:54.107+05:30 DEBUG 328 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Exiting from "ERROR" dispatch, status 404
2023-11-16T23:16:54.107+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.c.c.C.[.[.[.[dispatcherServlet]      :  Disabling the response for further output
2023-11-16T23:16:54.111+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.coyote.http11.Http11InputBuffer      : Before fill(): parsingHeader: [true], parsingRequestLine: [true], parsingRequestLinePhase: [0], parsingRequestLineStart: [0], byteBuffer.position(): [0], byteBuffer.limit(): [0], end: [811]
2023-11-16T23:16:54.111+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.tomcat.util.net.SocketWrapperBase    : Socket: [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@16f0bfc1:org.apache.tomcat.util.net.NioChannel@12444208:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55881]], Read from buffer: [0]
2023-11-16T23:16:54.111+05:30 DEBUG 328 --- [nio-8080-exec-1] org.apache.tomcat.util.net.NioEndpoint   : Socket: [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@16f0bfc1:org.apache.tomcat.util.net.NioChannel@12444208:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55881]], Read direct from socket: [0]
2023-11-16T23:16:54.111+05:30 DEBUG 328 --- [nio-8080-exec-1] o.a.coyote.http11.Http11InputBuffer      : Received []
2023-11-16T23:16:54.112+05:30 DEBUG 328 --- [nio-8080-exec-1] o.apache.coyote.http11.Http11Processor   : Socket: [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@16f0bfc1:org.apache.tomcat.util.net.NioChannel@12444208:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55881]], Status in: [OPEN_READ], State out: [OPEN]
2023-11-16T23:16:54.112+05:30 DEBUG 328 --- [nio-8080-exec-1] org.apache.tomcat.util.net.NioEndpoint   : Registered read interest for [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@16f0bfc1:org.apache.tomcat.util.net.NioChannel@12444208:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55881]]
2023-11-16T23:16:59.476+05:30 DEBUG 328 --- [nio-8080-exec-2] o.a.coyote.http11.Http11InputBuffer      : Before fill(): parsingHeader: [true], parsingRequestLine: [true], parsingRequestLinePhase: [0], parsingRequestLineStart: [0], byteBuffer.position(): [0], byteBuffer.limit(): [0], end: [811]
2023-11-16T23:16:59.476+05:30 DEBUG 328 --- [nio-8080-exec-2] o.a.tomcat.util.net.SocketWrapperBase    : Socket: [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@67ef3398:org.apache.tomcat.util.net.NioChannel@6928c115:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55882]], Read from buffer: [0]
2023-11-16T23:16:59.477+05:30 DEBUG 328 --- [nio-8080-exec-7] o.a.coyote.http11.Http11InputBuffer      : Before fill(): parsingHeader: [true], parsingRequestLine: [true], parsingRequestLinePhase: [0], parsingRequestLineStart: [0], byteBuffer.position(): [0], byteBuffer.limit(): [0], end: [0]
2023-11-16T23:16:59.477+05:30 DEBUG 328 --- [nio-8080-exec-7] o.a.tomcat.util.net.SocketWrapperBase    : Socket: [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@16f0bfc1:org.apache.tomcat.util.net.NioChannel@12444208:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55881]], Read from buffer: [0]
2023-11-16T23:16:59.477+05:30 DEBUG 328 --- [nio-8080-exec-2] o.apache.coyote.http11.Http11Processor   : Error parsing HTTP request header

java.io.EOFException: null
	at org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper.fillReadBuffer(NioEndpoint.java:1296) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper.read(NioEndpoint.java:1184) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11InputBuffer.fill(Http11InputBuffer.java:785) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:348) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:264) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:896) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1744) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at java.base/java.lang.Thread.run(Thread.java:833) ~[na:na]

2023-11-16T23:16:59.477+05:30 DEBUG 328 --- [nio-8080-exec-7] o.apache.coyote.http11.Http11Processor   : Error parsing HTTP request header

java.io.EOFException: null
	at org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper.fillReadBuffer(NioEndpoint.java:1296) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper.read(NioEndpoint.java:1184) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11InputBuffer.fill(Http11InputBuffer.java:785) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:348) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:264) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:896) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1744) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at java.base/java.lang.Thread.run(Thread.java:833) ~[na:na]

2023-11-16T23:16:59.478+05:30 DEBUG 328 --- [nio-8080-exec-2] o.apache.coyote.http11.Http11Processor   : Error state [CLOSE_CONNECTION_NOW] reported while processing request

java.io.EOFException: null
	at org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper.fillReadBuffer(NioEndpoint.java:1296) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper.read(NioEndpoint.java:1184) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11InputBuffer.fill(Http11InputBuffer.java:785) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:348) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:264) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:896) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1744) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at java.base/java.lang.Thread.run(Thread.java:833) ~[na:na]

2023-11-16T23:16:59.478+05:30 DEBUG 328 --- [nio-8080-exec-7] o.apache.coyote.http11.Http11Processor   : Error state [CLOSE_CONNECTION_NOW] reported while processing request

java.io.EOFException: null
	at org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper.fillReadBuffer(NioEndpoint.java:1296) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper.read(NioEndpoint.java:1184) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11InputBuffer.fill(Http11InputBuffer.java:785) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:348) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:264) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:896) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1744) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-10.1.15.jar:10.1.15]
	at java.base/java.lang.Thread.run(Thread.java:833) ~[na:na]

2023-11-16T23:16:59.479+05:30 DEBUG 328 --- [nio-8080-exec-7] o.apache.coyote.http11.Http11Processor   : Socket: [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@16f0bfc1:org.apache.tomcat.util.net.NioChannel@12444208:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55881]], Status in: [OPEN_READ], State out: [CLOSED]
2023-11-16T23:16:59.479+05:30 DEBUG 328 --- [nio-8080-exec-2] o.apache.coyote.http11.Http11Processor   : Socket: [org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@67ef3398:org.apache.tomcat.util.net.NioChannel@6928c115:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55882]], Status in: [OPEN_READ], State out: [CLOSED]
2023-11-16T23:16:59.479+05:30 DEBUG 328 --- [nio-8080-exec-7] o.apache.tomcat.util.threads.LimitLatch  : Counting down[http-nio-8080-exec-7] latch=2
2023-11-16T23:16:59.479+05:30 DEBUG 328 --- [nio-8080-exec-2] o.apache.tomcat.util.threads.LimitLatch  : Counting down[http-nio-8080-exec-2] latch=1
2023-11-16T23:16:59.479+05:30 DEBUG 328 --- [nio-8080-exec-2] org.apache.tomcat.util.net.NioEndpoint   : Calling [org.apache.tomcat.util.net.NioEndpoint@36785e47].closeSocket([org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@67ef3398:org.apache.tomcat.util.net.NioChannel@6928c115:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55882]])
2023-11-16T23:16:59.479+05:30 DEBUG 328 --- [nio-8080-exec-7] org.apache.tomcat.util.net.NioEndpoint   : Calling [org.apache.tomcat.util.net.NioEndpoint@36785e47].closeSocket([org.apache.tomcat.util.net.NioEndpoint$NioSocketWrapper@16f0bfc1:org.apache.tomcat.util.net.NioChannel@12444208:java.nio.channels.SocketChannel[connected local=/[0:0:0:0:0:0:0:1]:8080 remote=/[0:0:0:0:0:0:0:1]:55881]])
2023-11-16T23:17:46.385+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : Start expire sessions StandardManager at 1700156866385 sessioncount 0
2023-11-16T23:17:46.386+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : End expire sessions StandardManager processingTime 1 expired sessions: 0
2023-11-16T23:18:46.432+05:30 DEBUG 328 --- [alina-utility-1] o.apache.catalina.session.ManagerBase    : Start expire sessions StandardManager at 1700156926432 sessioncount 0
2023-11-16T23:18:46.433+05:30 DEBUG 328 --- [alina-utility-1] o.apache.catalina.session.ManagerBase    : End expire sessions StandardManager processingTime 1 expired sessions: 0
2023-11-16T23:19:46.468+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : Start expire sessions StandardManager at 1700156986468 sessioncount 0
2023-11-16T23:19:46.468+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : End expire sessions StandardManager processingTime 0 expired sessions: 0
2023-11-16T23:20:46.518+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : Start expire sessions StandardManager at 1700157046518 sessioncount 0
2023-11-16T23:20:46.518+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : End expire sessions StandardManager processingTime 0 expired sessions: 0
2023-11-16T23:21:46.564+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : Start expire sessions StandardManager at 1700157106563 sessioncount 0
2023-11-16T23:21:46.565+05:30 DEBUG 328 --- [alina-utility-2] o.apache.catalina.session.ManagerBase    : End expire sessions StandardManager processingTime 1 expired sessions: 0
2023-11-16T23:22:46.633+05:30 DEBUG 328 --- [alina-utility-1] o.apache.catalina.session.ManagerBase    : Start expire sessions StandardManager at 1700157166632 sessioncount 0
2023-11-16T23:22:46.634+05:30 DEBUG 328 --- [alina-utility-1] o.apache.catalina.session.ManagerBase    : End expire sessions StandardManager processingTime 1 expired sessions: 0
