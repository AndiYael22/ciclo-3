onload = function () {

    // creamos la red
    const container = document.getElementById('container');
    const genNew = document.getElementById('generate-graph');

    // inicializamos las opciones para las graficas
    const options = {
        edges: {
            labelHighlightBold: true,
            font: {
                size: 20
            }
        },
        nodes: {
            font: '12px arial darkred',
            scaling: {
                label: true
            },
            shape: 'icon',
            icon: {
                face: 'FontAwesome',
                code: '\uf015',
                size: 40,
                color: '#991133',
            }
        }
    };

    // inicializamos la red
    const network = new vis.Network(container);
    network.setOptions(options);

    function createData(){
        const cities = ['Delhi', 'Mumbai', 'Gujarat', 'Goa', 'Kanpur', 'Jammu', 'Hyderabad', 'Bangalore', 'Gangtok', 'Meghalaya'];

        //Inicializando el número de nodos graoh dinamicamente
        const V = Math.floor(Math.random() * cities.length) + 3;

        //se Preparan los datos de nodo para Vis.jss
        let vertices = [];
        for(let i=0;i<V;i++){
            vertices.push({id:i, label: cities[i-1]});
        }

        // se preparan las lineas Vis.js
        let edges = [];
        for(let i=1;i<V;i++){
            //Elegir un vecino de 0 a 1 para hacer la primer linea
            let neigh = Math.floor(Math.random()*i);

            // Agregamos la linea entre los nodos
            edges.push({from: i, to: neigh, color: 'orange',label: String(Math.floor(Math.random()*70)+30)});
        }

        //se preparan los datos del objeto Vis.js
        const data = {
            nodes: vertices,
            edges: edges
        };
        return data;
    }

    genNew.onclick = function () {
        // Creación y configuración de datos en la red.
        let data = createData();
        network.setData(data);
    };

    genNew.click();
};