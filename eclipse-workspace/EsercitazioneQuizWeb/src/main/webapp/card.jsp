<%@page import="model.Definizione"%>
<% Definizione def = (Definizione) request.getAttribute("definizione"); %>
<div class="card" style="width: 18rem;">
	<img src="https://booklife.co.uk/cdn/shop/files/9780192786739.png?v=1693914378" class="card-img-top" alt="...">
	<div class="card-body">
		<h5 class="card-title"><%= def.getParola() %></h5>
		<p class="card-text"><%= def.getTraduzione() %></p>
		<p class="card-text"><%= def.getFraseEng() %></p>
		<p class="card-text"><%= def.getFraseIta() %></p>

	</div>
</div>