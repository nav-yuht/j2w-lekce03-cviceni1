[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
  <meta charset="UTF-8">
  <title>Kartička zákazníka</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="preconnect" href="https://fonts.gstatic.com">
  <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,700;1,400;1,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="/css/style.css">
  <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div class="container">
  <div class="person-info">
    <div class="photo-border"></div>
    <img src="https://thispersondoesnotexist.com/image" class="photo" alt="profilové foto"/>
    <div class="row">
      <span class="label">Jméno</span>
      <span class="value">${person.jmeno}</span>
    </div>
    <div class="row">
      <span class="label">Příjmení</span>
      <span class="value">${person.prijmeni}</span>
    </div>
    <div class="row">
      <span class="label">Datum narození</span>
      <span class="value">${person.datumNarozeni?date}</span>
    </div>
    <div class="row">
      <span class="label">Věk</span>
      <span class="value">20</span>
    </div>
  </div>
  <div class="address">
    <div class="address-line">${address.uliceACisloDomu}</div>
    <div class="address-line">${address.obec}</div> ${address.PSC}</div>


</div>
</body>
</html>
