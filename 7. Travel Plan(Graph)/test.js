//pruebas unitarias de los metodos de la clase Dijkstra.js
const { createGraph, djikstra } = require('./Dijkstra');
describe("createGraph function", () => {
    test("crear una lista de adyacencia a partir de vértices y aristas dados", () => {
      const V = 4;
      const E = [[0, 1, 3], [0, 3, 2], [1, 2, 1], [2, 3, 5]];
      const expectedOutput = [[ [1, 3], [3, 2] ], [ [0, 3], [2, 1] ], [ [1, 1], [3, 5] ], [ [0, 2], [2, 5] ]];
      expect(createGraph(V, E)).toEqual(expectedOutput);
    });
  });
  
  describe("djikstra function", () => {
    test("calcular las distancias más cortas desde el nodo de origen a todos los demás nodos", () => {
      const V = 9;
      const E = [[0,1,4], [0,7,8], [1,7,11], [1,2,8], [7,8,7], [6,7,1], [2,8,2], [6,8,6], [5,6,2], [2,5,4], [2,3,7], [3,5,14], [3,4,9], [4,5,10]];
      const graph = createGraph(V, E);
      const src = 0;
      const expectedOutput = [[0, -1], [4, 0], [12, 1], [19, 2], [21, 3], [11, 2], [9, 7], [8, 0], [14, 2]];
      expect(djikstra(graph, V, src)).toEqual(expectedOutput);
    });
  });
  