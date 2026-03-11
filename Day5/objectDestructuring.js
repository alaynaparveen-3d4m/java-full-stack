const user = { name: 'Alayna', age: 21, city: 'Nandalur' };
// Basic
const { name, age } = user;
// Rename while destructuring
const { name: fullName, age: years } = user;
// Default values
const { country = 'India' } = user;
console.log(country); // 'India'
