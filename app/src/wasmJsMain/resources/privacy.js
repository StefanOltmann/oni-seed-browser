(function () {
    const mailUser = 'privacy';
    const mailDomain = 'stefan-oltmann';
    const mailTld = 'de';

    const privacyEmailEl = document.getElementById('privacy-email');

    const emailAddress = mailUser + '@' + mailDomain + '.' + mailTld;
    if (privacyEmailEl)
        privacyEmailEl.textContent = emailAddress;
})();
