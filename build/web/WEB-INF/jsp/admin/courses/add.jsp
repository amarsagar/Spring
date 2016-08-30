<%@include  file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Add Course</h1>
<form:form modelAttribute="Course" action="${SITE_URL}/admin/courses/save" method="post" role="form">
    <div class="form-group">
        <label>Name</label>
        <form:input path="name" placeholder="Enter name" required="required" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>Description</label>
        <form:textarea path="description" placeholder="Enter description" required="required" class="form-control"/>
    </div>
    
   <div class="form-group">
        <label>Duration</label>
       <form:input path="duration" placeholder="Enter duration" required="required" class="form-control"/>
        
       <form:select path="duration_Type" required="required">
            <option value="">Select Duration Type</option>
            <option value="days">Days </option>
            <option value="week">Weeks</option>
            <option value="month">Months </option>
            <option value="year">years </option>
        </form:select>
    </div>
    
    <div class="form-group">
        <label>Fees</label>
        <form:input path="fees" placeholder="Enter fees" required="required" class="form-control"/>
    </div>
    
    <div class="checkbox">
        <label><input type="checkbox" name="status" value="1" /></label>
        <label>Status </label>
       
    </div>
    <form:hidden path="id"/>
    <button type="submit" class="btn btn-success" >Save</button>
    
</form:form>

<%@include  file="../footer.jsp" %>