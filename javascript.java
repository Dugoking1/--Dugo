// scripts.js
document.addEventListener('DOMContentLoaded', () => {
    const cart = [];
    const buttons = document.querySelectorAll('button');

    buttons.forEach(button => {
        button.addEventListener('click', event => {
            const product = event.target.parentElement;
            const productName = product.querySelector('h3').innerText;
            const productPrice = product.querySelector('p').innerText;
            addToCart(productName, productPrice);
        });
    });

    function addToCart(name, price) {
        cart.push({ name, price });
        alert(`${name} تم إضافته إلى السلة.`);
        console.log(cart);
    }
});
