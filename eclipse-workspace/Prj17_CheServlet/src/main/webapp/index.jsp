<%@page import="java.time.LocalDateTime"%>
<html>

	<head>
		<title>Pagina principale</title>
	</head>
	<body>
		<h1>Home page JSP</h1>
		
		<%= LocalDateTime.now() %>
		
		<form action="libri" method="post">
		
			<input type="text" name="titolo" placeholder="titolo"><br>
			<input type="text" name="autore" placeholder="autore"><br>
			<input type="number" name="id" placeholder="id"><br>
			<input type="number" step="0.5" name="prezzo" placeholder="prezzo"><br>
			<button>Add Libro</button>
		</form>

		<table id="tabella">
		  <tr>
		    <th>Titolo</th>
		    <th>Autore</th>
		  </tr>
		</table>

		<script type="text/javascript">
			const URL = 'libri';
			const TABLE = document.getElementById('tabella')
			fetch(URL)
				.then(libri => libri.json())
				.then(libri => {
					for (libro of libri){
						const RIGA = document.createElement('tr')
						const CELLA1 = document.createElement('td')
						const CELLA2 = document.createElement('td')
						CELLA1.textContent = libro.titolo
						CELLA2.textContent = libro.autore
						RIGA.append(CELLA1, CELLA2)
						TABLE.append(RIGA)
					}
					
				})
		
		
		</script>
		
	</body>
</html>