<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ attribute name="id" required="true" %>

<%@ attribute name="value" required="false" %>


<input type="text" id="${id}" name="${id}" value="${value}"/>

<script>
$( function() {
  $( "#${id}" ).datepicker();
} );
</script>
