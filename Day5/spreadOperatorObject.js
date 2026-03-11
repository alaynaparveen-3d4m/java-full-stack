const defaults = { theme: 'dark', lang: 'en', font: 'mono' };
const userPrefs = { lang: 'hi', fontSize: 14 };

const config = { ...defaults, ...userPrefs };

const clone = { ...defaults };

console.log(config);
console.log(clone);