const productos = [
    {
        img: 'https://i.pinimg.com/564x/1d/0d/98/1d0d9860c18e82db96a62ab355243077.jpg',
        title : `Café`,
        precio: `S/14.00`,
        estado : `En Stock`

    },

    {
        img: 'https://i.pinimg.com/236x/a9/94/0b/a9940b3ca181abf8ca519e16c7619cc6.jpg',
        title : `Leche`,
        precio: `S/20.00`,
        estado : `En Stock`
    },

    {
        img: 'https://i.pinimg.com/564x/25/67/29/256729d3fa50293983beb71cf8e2ca1e.jpg',
        title : `producto6`,
        precio: `S/15.00`,
        estado : `Agotado`
    },

    {
        img: 'https://i.pinimg.com/564x/a3/ef/1a/a3ef1ae0b6fe7e38b6e819f1e5a3013a.jpg',
        title : `producto6`,
        precio: `16.00`,
        estado : `Agotado`
    }

]

const $cards = document.querySelector(".wrapper-grid");
const $template = document.getElementById("template").content;
const $fragment = document.createDocumentFragment();

productos.forEach( e => {
    //Agregamos atributos de la etiqueta...
    $template.querySelector("img").setAttribute("src", e.img);
    $template.querySelector("img").setAttribute("alt", e.title);
    $template.querySelector("img").setAttribute("class", "profile-img");
    $template.querySelector(".nombreBe").textContent = e.title;
    $template.querySelector(".precioBe").textContent = e.precio;
    $template.querySelector(".estadoBe").textContent = e.estado;

    if(e.estado === `Agotado` ){
        $template.querySelector("button").setAttribute("style", "display: none;")
    }
    // Clonamos un nodo (referencia, copia estructura)
    let $clone = document.importNode($template, true)

    $fragment.appendChild($clone);
});

$cards.appendChild($fragment)