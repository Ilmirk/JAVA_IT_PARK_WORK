<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <title>Пользователи</title>
<link rel="stylesheet" type="text/css" href="/resources/list.css">
</head>
<body>
<ul class="drop_down_list">
<#list number.users as user>
    <li>${user.name}</li>
    <li>${user.phone}</li>
    <ul>
        <#list user.credits as credits>
            <li>${credits.number}</li>
        </#list>
    </ul>
</#list>
</ul>
</body>