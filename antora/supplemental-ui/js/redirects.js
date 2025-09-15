const redirects = [
    /* spring */
    {current: /(\/spring\/2023\.[12])/, target: '/spring'},
    {current: /(\/spring\/2022\.\d)/, target: '/spring'},
    {current: /(\/spring\/2021\.\d)/, target: '/spring'},
    {current: /(\/spring\/2020\.\d)/, target: '/spring'},
    /* micronaut */
    {current: /(\/micronaut\/2023\.[12])/, target: '/micronaut'},
    {current: /(\/micronaut\/2022\.\d)/, target: '/micronaut'},
    {current: /(\/micronaut\/2021\.\d)/, target: '/micronaut'},
    {current: /(\/micronaut\/2020\.\d)/, target: '/micronaut'},
];

document.addEventListener('DOMContentLoaded', () => {
    const currentPath = window.location.pathname;

    for (const version of redirects) {
        const match = currentPath.match(version.current);
        if (match.index != null) {
          const element = document.getElementById('redirect');
          element.textContent = 'This looks like a link to an old version, trying to redirect to the latest version.';

          const newPath = currentPath.replace(version.current, version.target);

          setTimeout(() => {
              window.location.replace(newPath);
          }, 2000);
        }
    }
});
