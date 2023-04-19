<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Other/html.html to edit this template
-->
<html>
    <head>
        <title>Add new task</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>

        <form action="/processForm" method="post">
        
            <div>
                <label>Description</label>
                <input type="text" name="description">
            </div>
            <div>
                <label>Priority</label>
                <input type="number" name="priority">
            </div>
            <div>
                <label>Date</label>
                <input type="date" name="date">
            </div>
            
            <input type="submit" value="Add"/>
        </form>

    </body>
</html>
