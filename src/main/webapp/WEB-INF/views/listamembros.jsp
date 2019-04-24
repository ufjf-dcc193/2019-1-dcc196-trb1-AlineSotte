<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>exem01: LISTA DE MEMBROS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>

<body>
    <div>
        <h1>lista de Membros</h1>

        <c:forEach var="mb" items="${listameb}">
            fieldset>
            <legend>Dados Pessoais</legend>
            <table cellspacing="10">
                <tr>
                    <td>
                        <p>${mb.nome}</p>
                        <input type="submit" value="Excluir">
                        <input type="submit" value="Atualizar">
                    </td>
                </tr>
                <tr>
                </tr>
            </table>
            </fieldset>
        </c:forEach>
    </div>
    <div>
        <a href="index.html">home</a>
    </div>
</body>

</html>