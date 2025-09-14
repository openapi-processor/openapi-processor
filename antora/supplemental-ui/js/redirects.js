const redirects = [
  { current: '/spring/2022.5', target: '/spring' },
  { current: '/spring/2022.4', target: '/spring' },
  { current: '/spring/2022.3', target: '/spring' },
  { current: '/spring/2022.2', target: '/spring' },
  { current: '/spring/2022.1', target: '/spring' }
];

document.addEventListener('DOMContentLoaded', () => {
    const currentPath = window.location.pathname;

    for (const version of redirects) {
        const pos = currentPath.indexOf(version.current);
        if (pos > -1) {
          const element = document.getElementById('redirect');
          element.textContent = 'This looks like a link to an old version, trying to redirect to the latest version.';

          const newPath = currentPath.replace(version.current, version.target);

          setTimeout(() => {
              window.location.replace(newPath);
          }, 2000);
        }
    }
});
