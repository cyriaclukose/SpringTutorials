In this tutorial we will explore how we can mention custom spring configuraion files

In web.xml we will specify the initi-param with param name as contextConfigLocation
and file names as commma seperated values

Eg:
<init-param>

<param-name>contextConfigLocation</param-name>
<param-value>/WEB-INF/myapp1.servlet.xml,/WEB-INF/myapp2.servlet.xml</param-value>
</init-param>
