<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ attribute name="id" required="true" %>

<input type="text" id="${id}" name="${id}" />

<script>
$( function() {
  $( "#${id}" ).datepicker();
} );
</script>
