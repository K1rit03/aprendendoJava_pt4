const colors = ['#FA8072', '#F0E68C', '#7FFFD4'];

function changeBackgroundColor() {
    const randomColor = colors[Math.floor(Math.random() * colors.length)];
    document.body.style.backgroundColor = randomColor;
}

// Chama a função inicialmente para definir a cor de fundo
changeBackgroundColor();

// Define um intervalo para chamar a função a cada 5 segundos (5000 milissegundos)
setInterval(changeBackgroundColor, 5000);
