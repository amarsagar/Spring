<%@include  file="../header.jsp" %>
        <h1>Courses</h1>
        <div class="pull-right">
            <p>
                <a href="${SITE_URL}/admin/courses/add" class="btn btn-primary" title="Add Course"/>
                <span class="glyphicon glyphicon-plus"></span>
                </a>
                
            </p>
        </div>
        
        <table class="table table-bordered table-hover table-striped">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Duration</td>
                <td>Fees</td>
                <td>Added Date</td>                
                <td>Status</td>
                <td>Action</td>
                      
            </tr>
            <c:forEach var="course" items="${courses}">
                <tr>
                <td>${course.id}</td>
                <td>${course.name}</td>
                <td>${course.duration}${course.duration_Type}</td>
                <td>${course.fees}</td>
                <td>${course.addedDate}</td>
                <td>${course.status}</td>
                <td>
                    <a href="${SITE_URL}/admin/courses/edit/ ${course.id}" class="btn btn-success" title="Edit Course"/>
                    <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                     <a href="${SITE_URL}/admin/courses/delete/ ${course.id}" class="btn btn-danger" title="Delete Course" onclick="return confirm('Are you sure to delete')"/>
                    <span class="glyphicon glyphicon-trash"></span>
                    </a
                </td>
                </tr>
                
                
            </c:forEach>
            
        </table>
  <%@include  file="../footer.jsp" %>