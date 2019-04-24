<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Formulario Membro</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>

<body>
        <form action="addmembros.html" method="post">
            <fieldset>
                <legend>Dados Pessoais</legend>
                <table cellspacing="10">
                    <tr>
                        <td>
                            <label for="nome">Nome Completo: </label>
                        </td>
                        <td align="left">
                            <input type="text" name="email">
                        </td>
    
                    </tr>
                    <tr>
                            <td>
                                <label for="nome">Função: </label>
                            </td>
                            <td align="left">
                                <input type="text" name="funcao">
                            </td>
        
                        </tr>
                    <tr></tr>
                    </tr>
                    </tr>
                </table>
            </fieldset>
    
            <br />
            <!-- ENDEREÇO -->
            <fieldset>
                <legend>Dados de Endereço</legend>
                <table cellspacing="10">
    
                    <tr>
                        <td>
                            <label for="email">Email:</label>
                        </td>
                        <td align="left">
                            <input type="text" name="email">
                        </td>
                        <td>
                            <label for="numero">Data Entrada</label>
                        </td>
                        <td align="left">
                            <input type="text" name="numero" size="10">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="bairro">Data Saida </label>
                        </td>
                        <td align="left">
                            <input type="text" name="numero" size="10">
                        </td>
                    </tr>
                    
                </table>
            </fieldset>
            <br />
    
            <input type="submit" value="Salvar" />
            <br/>
        </form>
    </body>
    
    </html>