<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Fomulario Atividade</title>
    <meta name="viewport" content="wnameth=device-wnameth, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>

<body>
    <form action="addsede.html" method="post">
        <fieldset>
            <legend>Dados Pessoais</legend>
            <table cellspacing="10">
                <tr>
                    <td>
                        <label for="nome">Título </label>
                    </td>
                    <td align="left">
                        <input type="text" name="Título">
                    </td>

                </tr>
                <tr>
                    <td>
                        <label for="nome">Descrição </label>
                    </td>
                    <td>
                        <tex align="left">
                            <textarea name="Descrição" rows="10" cols="40"></textarea>
                    </td>

                </tr>
            </table>
        </fieldset>

        <br />

        <fieldset>
            <legend>Categorias</legend>
            <table cellspacing="10">
                <tr>
                    <td>
                        <label for="categoria">Categoria:</label>
                    </td>
                    <td align="left">
                        <select name="categoria">
                            <option value="ac">Assistencial</option>
                            <option value="am">Executiva</option>
                            <option value="al">Financeira</option>
                            <option value="ap">Jurídica</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="cidade">Data de Entrada</label>
                    </td>
                    <td align="left">
                        <input type="text" name="horaentrada">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="cidade">Data de Saída </label>
                    </td>
                    <td align="left">
                        <input type="text" name="horasaida">
                    </td>
                </tr>
            </table>
        </fieldset>
        <br />

        <input type="submit" value="Salvar" />
        <br />
    </form>
</body>

</html>

