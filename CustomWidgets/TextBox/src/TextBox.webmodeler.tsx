import { Component, createElement } from "react";
import { TextBoxPreviewProps, VisibilityMap } from "../typings/TextBoxProps";
import { TextInput } from "./components/TextInput";

declare function require(name: string): string;

// eslint-disable-next-line @typescript-eslint/class-name-casing
export class preview extends Component<TextBoxPreviewProps> {
    render(): JSX.Element {
        return <TextInput value={this.props.textAttribute} />;
    }
}

export function getVisibleProperties(_valueMap: TextBoxPreviewProps, visibilityMap: VisibilityMap): VisibilityMap {
    /* To hide any property in Web Modeler, please assign the property in visibilityMap to false */
    return visibilityMap;
}

export function getPreviewCss(): string {
    return require("./ui/TextBox.css");
}


