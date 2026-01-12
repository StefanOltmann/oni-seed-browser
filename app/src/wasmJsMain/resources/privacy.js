(function() {
    const mailUser = 'info';
    const mailDomain = 'stefan-oltmann';
    const mailTld = 'de';

    const emailTextEl = document.getElementById('email-text');
    const privacyEmailEl = document.getElementById('privacy-email');

    const emailAddress = mailUser + '@' + mailDomain + '.' + mailTld;
    if (emailTextEl) {
        emailTextEl.textContent = emailAddress;
    }
    if (privacyEmailEl) {
        privacyEmailEl.textContent = emailAddress;
    }
})();
