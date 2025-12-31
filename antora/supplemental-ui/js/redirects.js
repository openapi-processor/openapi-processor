const redirects = [
    /* spring */
    {current: /(\/spring\/2024\.\d+)/, target: '/spring'},
    {current: /(\/spring\/2023\.\d+)/, target: '/spring'},
    {current: /(\/spring\/2022\.\d+)/, target: '/spring'},
    {current: /(\/spring\/2021\.\d+)/, target: '/spring'},
    {current: /(\/spring\/2020\.\d+)/, target: '/spring'},
    /* micronaut */
    {current: /(\/micronaut\/2024\.\d+)/, target: '/micronaut'},
    {current: /(\/micronaut\/2023\.\d+)/, target: '/micronaut'},
    {current: /(\/micronaut\/2022\.\d+)/, target: '/micronaut'},
    {current: /(\/micronaut\/2021\.\d+)/, target: '/micronaut'},
    {current: /(\/micronaut\/2020\.\d+)/, target: '/micronaut'},
    /* gradle */
    {current: /(\/gradle\/2022\.\d+)/, target: '/gradle'},
    {current: /(\/gradle\/2021\.\d+)/, target: '/gradle'},
    /* maven */
    {current: /(\/maven\/2021\.\d+)/, target: '/maven'},
    {current: /(\/maven\/1\.\d+)/, target: '/maven'},
];

function redirect() {
    if (window.location.search.includes('redirected')) {
        console.log('page was already redirected, stopping ...');
        return;
    }

    const currentPath = window.location.pathname + '?redirected';

    for (const version of redirects) {
        const match = currentPath.match(version.current);
        if (match) {
            const element = document.getElementById('redirect');
            element.textContent = 'This looks like a link to an old version, trying to redirect to the latest version.';

            const newPath = currentPath.replace(version.current, version.target);

            setTimeout(() => {
                window.location.replace(newPath);
            }, 2000);

            return;
        }
    }
}


if (document.readyState !== 'loading') {
    redirect();
} else {
    document.addEventListener('DOMContentLoaded', function () {
        redirect();
    });
}
