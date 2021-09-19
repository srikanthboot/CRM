<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib  uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page pageEncoding="utf-8" %>

<c:if test="${msg ne  null}">
 <h3 style="border: 2px solid blue; color: red; width: 150px">
  <c:out value="${msg}"/>
 </h3>  
</c:if>
<hr>
Select preferred language : <a href="login?language=en"> <spring:message code="label.english"/> </a>
                            &nbsp; &nbsp; &nbsp; 
                            <a href="login?language=hi"> <spring:message code="label.hindi"/> </a>
                            
<form:form  action="userLogin"  method="post"  modelAttribute="loginBean">
  <table>
    <tr>
       <td> <spring:message code="label.email"/> </td> <td> <form:input  path="email"/> </td>
    </tr>
    <tr>
       <td> <spring:message code="label.password"/> </td> <td> <form:password  path="password"/> </td>
    </tr>
    <tr>
       <td colspan="2"> <input  type="submit"  value="<spring:message code='label.submit'/>"> </td>
    </tr>              
  </table>
  
</form:form>