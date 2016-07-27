
import br.ufjf.myexperiment.core.MyExperimentClient;
import br.ufjf.myexperiment.model.File;
import br.ufjf.myexperiment.model.Search;
import br.ufjf.myexperiment.model.Workflow;

/*
 * The MIT License
 *
 * Copyright 2014 Pós-Graduação em Ciência da Computação UFJF.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
/**
 *
 * @author vitorfs
 */
public class Samples {
    
    public static void main(String[] args) {
        MyExperimentClient client = new MyExperimentClient();
        client.setBaseUri("http://www.myexperiment.org/");
        
        try {
            Search search = client.search("fasta");
            for (Workflow workflow : search.getWorkflow()) {
                System.out.println(workflow);
            }
            for (File file : search.getFile()) {
                System.out.println(file);
            }
        } catch (Exception e) {
        }
    }
    
}
